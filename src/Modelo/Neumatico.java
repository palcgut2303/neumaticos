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
public class Neumatico {
    
    private String codigo;
    private String marca;
    private String modelo;
    private int ancho;
    private String perfil;
    private double precio;

    public Neumatico(){
        
    }
    
    public Neumatico(String codigo, String marca, String modelo, int ancho, String perfil, double precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ancho = ancho;
        this.perfil = perfil;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Neumatico{" + "codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", ancho=" + ancho + ", perfil=" + perfil + ", precio=" + precio + '}';
    }
    
    
}
