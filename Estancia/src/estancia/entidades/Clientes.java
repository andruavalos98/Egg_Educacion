/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.entidades;

/**
 *
 * @author andru
 */
public class Clientes {
    private int idCliente, numero;
    private String nombre, calle, codigoPostal, ciudad, pais, email;

    public Clientes() {
    }

    public Clientes(int idCliente, int numero, String nombre, String calle, String codigoPostal, String ciudad, String pais, String email) {
        this.idCliente = idCliente;
        this.numero = numero;
        this.nombre = nombre;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.pais = pais;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", numero=" + numero + ", nombre=" + nombre + ", calle=" + calle + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", pais=" + pais + ", email=" + email + '}';
    }
    
    
}
