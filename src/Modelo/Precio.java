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
public class Precio {
    
    private double prec_base;
    private double iva;
    private double prec_total;

    public Precio(double prec_base, double iva, double prec_total) {
        this.prec_base = prec_base;
        this.iva = iva;
        this.prec_total = prec_total;
    }

    public double getPrec_base() {
        return prec_base;
    }

    public void setPrec_base(double prec_base) {
        this.prec_base = prec_base;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrec_total() {
        return prec_total;
    }

    public void setPrec_total(double prec_total) {
        this.prec_total = prec_total;
    }

    public Precio() {
    }
    
    
    
}
