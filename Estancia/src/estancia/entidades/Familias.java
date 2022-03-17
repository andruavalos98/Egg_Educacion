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
public class Familias {
    private int idFamilia, edadMin, edadMax, numHijos, idCasaFamilia;
    private String nombre, email;

    public Familias() {
    }

    public Familias(int idFamilia, int edadMin, int edadMax, int numHijos, int idCasaFamilia, String nombre, String email) {
        this.idFamilia = idFamilia;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.numHijos = numHijos;
        this.idCasaFamilia = idCasaFamilia;
        this.nombre = nombre;
        this.email = email;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public int getEdadMax() {
        return edadMax;
    }

    public void setEdadMax(int edadMax) {
        this.edadMax = edadMax;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public int getIdCasaFamilia() {
        return idCasaFamilia;
    }

    public void setIdCasaFamilia(int idCasaFamilia) {
        this.idCasaFamilia = idCasaFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Familias{" + "idFamilia=" + idFamilia + ", edadMin=" + edadMin + ", edadMax=" + edadMax + ", numHijos=" + numHijos + ", idCasaFamilia=" + idCasaFamilia + ", nombre=" + nombre + ", email=" + email + '}';
    }
    
    
}
