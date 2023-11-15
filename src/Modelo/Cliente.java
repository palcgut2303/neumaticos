/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author manana
 */
public class Cliente {
    
    private String nif;
    private String nombre;
    private String direccion;
    private int num;
    private int cp;
    private String poblacion;
    private String provincia;
    private String telefono;
    private String email;

    public Cliente(String nif, String nombre, String direccion, int num, int cp, String poblacion, String provincia, String telefono, String email) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.num = num;
        this.cp = cp;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.telefono = telefono;
        this.email = email;
    }
    
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return nif + " " + nombre + " " + direccion + " " + num + " " + cp + " " + poblacion + " " + provincia + " " + telefono + " " + email;
    }
    
}
