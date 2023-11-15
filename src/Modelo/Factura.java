/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author manana
 */
public class Factura {
    
    private int numFactura;
    private String nifCliente;
    private String nifEmisor;
    private String fechaSistema;
    private double prec_base;
    private double iva;
    private double prec_total;
    private String num_Cuenta;

    public Factura(int numFactura, String nifCliente, String nifEmisor, String fechaSistema, double prec_base, double iva, double prec_total, String num_Cuenta) {
        this.numFactura = numFactura;
        this.nifCliente = nifCliente;
        this.nifEmisor = nifEmisor;
        this.fechaSistema = fechaSistema;
        this.prec_base = prec_base;
        this.iva = iva;
        this.prec_total = prec_total;
        this.num_Cuenta = num_Cuenta;
    }

    public Factura() {
    }

    
    
    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public String getNifEmisor() {
        return nifEmisor;
    }

    public void setNifEmisor(String nifEmisor) {
        this.nifEmisor = nifEmisor;
    }

    public String getFechaSistema() {
        return fechaSistema;
    }

    public void setFechaSistema(String fechaSistema) {
        this.fechaSistema = fechaSistema;
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

    public String getNum_Cuenta() {
        return num_Cuenta;
    }

    public void setNum_Cuenta(String num_Cuenta) {
        this.num_Cuenta = num_Cuenta;
    }

    @Override
    public String toString() {
        return "Factura{" + "numFactura=" + numFactura + ", nifCliente=" + nifCliente + ", nifEmisor=" + nifEmisor + ", fechaSistema=" + fechaSistema + ", prec_base=" + prec_base + ", iva=" + iva + ", prec_total=" + prec_total + ", num_Cuenta=" + num_Cuenta + '}';
    }
    
    
    
}
