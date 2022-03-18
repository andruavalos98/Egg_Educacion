/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Mascota;
import entidades.Voto;
import errores.ErrorServicio;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositorios.MascotaRepositorio;
import repositorios.VotoRepositorio;

/**
 *
 * @author andru
 */
@Service
public class VotoServicio {

    @Autowired
    private MascotaRepositorio mascotaRepositorio;

    @Autowired
    private VotoRepositorio votoRepositorio;

    @Autowired
    private NotificacionServicio notificacionServicio;

    public void votar(String idUsusario, String idMascota1, String idMascota2) throws ErrorServicio {
        Voto voto = new Voto();
        voto.setFecha(new Date());

        if (idMascota1.equals(idMascota2)) {
            throw new ErrorServicio("No puede votarse a si mismo");
        }

        Optional<Mascota> respuesta = mascotaRepositorio.findById(idMascota1);
        if (respuesta.isPresent()) {
            Mascota mascota1 = respuesta.get();
            if (mascota1.getUsuario().getId().equals(idUsusario)) {
                voto.setMascota1(mascota1);
            } else {
                throw new ErrorServicio("No tiene permisos para realizar la operacion solicitada");
            }
        } else {
            throw new ErrorServicio("No se encontro una mascota con ese id");
        }

        Optional<Mascota> respusta2 = mascotaRepositorio.findById(idMascota2);
        if (respusta2.isPresent()) {
            Mascota mascota2 = respusta2.get();
            voto.setMascota2(mascota2);

            notificacionServicio.enviar("Tu mascota fue votada!", "Tinder de mascotas", mascota2.getUsuario().getMail());

        } else {
            throw new ErrorServicio("No se encontro una mascota con ese id");
        }

        votoRepositorio.save(voto);

    }

    public void responder(String idUsuario, String idVoto) throws ErrorServicio {
        Optional<Voto> respuesta = votoRepositorio.findById(idVoto);
        if (respuesta.isPresent()) {
            Voto voto = respuesta.get();

            voto.setFecha(new Date());

            if (voto.getMascota2().getUsuario().getId().equals(idUsuario)) {
                notificacionServicio.enviar("Tu voto fue correspondido", "Tinder de mascotas", voto.getMascota1().getUsuario().getMail());

                votoRepositorio.save(voto);
            } else {
                throw new ErrorServicio("No tiene permisos para realizar esta accion");
            }

        } else {
            throw new ErrorServicio("No existe el voto solicitado");

        }
    }

}
