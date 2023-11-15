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
public class Linea_Factura {
    
    
    private String concepto;
    private int numNeumatico;
    private double precio;

    public Linea_Factura(int numNeumatico,String concepto , double precio) {
        this.numNeumatico = numNeumatico;
        this.concepto = concepto;
        this.precio = precio;
    }

    public Linea_Factura() {
    }

   

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getNumNeumatico() {
        return numNeumatico;
    }

    public void setNumNeumatico(int numNeumatico) {
        this.numNeumatico = numNeumatico;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Linea_Factura{" + ", concepto=" + concepto + ", numNeumatico=" + numNeumatico + ", precio=" + precio + '}';
    }

    
    
    
}
