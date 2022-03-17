/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Casas;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andru
 */
public class CasasDao extends Dao {

    private SimpleDateFormat convertir = new SimpleDateFormat("yyyy-mm-dd");

    public List<Casas> listAll() {
        String query = "select * from casas";
        consultar(query);
        List<Casas> casas = new ArrayList<>();
        Casas casa;

        try {
            while (resultado.next()) {
                casa = new Casas();
                casa.setIdCasa(resultado.getInt("id_casa"));
                casa.setCalle(resultado.getString("calle"));
                casa.setNumero(resultado.getInt("numero"));
                casa.setCodigoPostal(resultado.getString("codigo_postal"));
                casa.setCiudad(resultado.getString("ciudad"));
                casa.setPais(resultado.getString("pais"));
                casa.setFechaDesde(resultado.getDate("fecha_desde"));
                casa.setFechaHasta(resultado.getDate("fecha_hasta"));
                casa.setTiempoMin(resultado.getInt("tiempo_minimo"));
                casa.setTiempoMax(resultado.getInt("tiempo_maximo"));
                casa.setPrecioHabitacion(resultado.getDouble("precio_habitacion"));
                casa.setTipoVivienda(resultado.getString("tipo_vivienda"));

                casas.add(casa);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return casas;
    }

    public List<Casas> casasDisponibles01082020_31082020_RU() {
        String query = "select id_casa, calle, numero, pais, fecha_desde, fecha_hasta from casas where pais = 'Reino Unido' and fecha_desde = '2020-08-01' and fecha_hasta = '2020-08-31'";
        consultar(query);
        List<Casas> casas = new ArrayList<>();
        Casas casa;

        try {
            while (resultado.next()) {
                casa = new Casas();
                casa.setIdCasa(resultado.getInt("id_casa"));
                casa.setCalle(resultado.getString("calle"));
                casa.setNumero(resultado.getInt("numero"));
                casa.setPais(resultado.getString("pais"));
                casa.setCiudad(resultado.getString("pais"));
                casa.setFechaDesde(resultado.getDate("fecha_desde"));
                casa.setFechaHasta(resultado.getDate("fecha_hasta"));

                casas.add(casa);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return casas;
    }

    public List<Casas> casasDisponibles(Date fechaDesde, Date fechaHasta) {
        String query = "select id_casa, calle, numero, pais, fecha_desde, fecha_hasta from casas where pais = 'Reino Unido' and fecha_desde >= '" + convertir.format(fechaDesde) + "' and fecha_hasta <= '" + convertir.format(fechaHasta) + "'";
        consultar(query);
        List<Casas> casas = new ArrayList<>();
        Casas casa;

        try {
            while (resultado.next()) {
                casa = new Casas();
                casa.setIdCasa(resultado.getInt("id_casa"));
                casa.setCalle(resultado.getString("calle"));
                casa.setNumero(resultado.getInt("numero"));
                casa.setPais(resultado.getString("pais"));
                casa.setCiudad(resultado.getString("pais"));
                casa.setFechaDesde(resultado.getDate("fecha_desde"));
                casa.setFechaHasta(resultado.getDate("fecha_hasta"));

                casas.add(casa);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return casas;
    }

}
