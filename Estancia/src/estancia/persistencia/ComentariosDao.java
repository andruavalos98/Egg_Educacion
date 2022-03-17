/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Comentarios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andru
 */
public class ComentariosDao extends Dao {
     public List<Comentarios> listAll() {

        String query = "select * from comentarios";
        consultar(query);
        List<Comentarios> comentarios = new ArrayList<>();
        Comentarios comentario;

        try {
            while (resultado.next()) {
                comentario = new Comentarios();
                comentario.setIdComentario(resultado.getInt("id_comentario"));
                comentario.setIdCasa(resultado.getInt("id_casa"));
                comentario.setComentario(resultado.getString("comentario"));

                comentarios.add(comentario);
            }
        } catch (SQLException ex) {
            System.out.println("Ocurrio un error al recorrer el resultado: " + ex.getMessage());
        } finally {
            desconectarme();
        }
        return comentarios;
    }
}
