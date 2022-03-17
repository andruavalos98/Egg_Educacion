/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.entidades;

import java.sql.Date;

/**
 *
 * @author andru
 */
public class Estancias {
    private int idEstancia, idCliente, idCasa;
    private String nombreHuesped;
    private Date fechaDesde, fechaHasta;

    public Estancias() {
    }

    public Estancias(int idEstancia, int idCliente, int idCasa, String nombreHuesped, Date fechaDesde, Date fechaHasta) {
        this.idEstancia = idEstancia;
        this.idCliente = idCliente;
        this.idCasa = idCasa;
        this.nombreHuesped = nombreHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public int getIdEstancia() {
        return idEstancia;
    }

    public void setIdEstancia(int idEstancia) {
        this.idEstancia = idEstancia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    @Override
    public String toString() {
        return "Estancias{" + "idEstancia=" + idEstancia + ", idCliente=" + idCliente + ", idCasa=" + idCasa + ", nombreHuesped=" + nombreHuesped + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + '}';
    }
    
    
}
