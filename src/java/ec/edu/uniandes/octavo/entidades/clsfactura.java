/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.octavo.entidades;

import ec.edu.uniandes.octavo.funciones.crudfactura;
import java.util.Date;

/**
 *
 * @author USU-PC
 */
public class clsfactura {
     private int _numerofac;
     private Date _fecha;
     private double _subtotal;
     private double _iva;
     private double _total;
     private clscliente _id;
     
    private boolean toString;

    public clsfactura() {
    }

    public clsfactura(int _numerofac, Date _fecha, double _subtotal, double _iva, double _total, clscliente _id) {
        this._numerofac = _numerofac;
        this._fecha = _fecha;
        this._subtotal = _subtotal;
        this._iva = _iva;
        this._total = _total;
        this._id = _id;
    }

    public int getNumerofac() {
        return _numerofac;
    }

    public void setNumerofac(int _numerofac) {
        this._numerofac = _numerofac;
    }

    public Date getFecha() {
        return _fecha;
    }

    public void setFecha(Date _fecha) {
        this._fecha = _fecha;
    }

    public double getSubtotal() {
        return _subtotal;
    }

    public void setSubtotal(double _subtotal) {
        this._subtotal = _subtotal;
    }

    public double getIva() {
        return _iva;
    }

    public void setIva(double _iva) {
        this._iva = _iva;
    }

    public double getTotal() {
        return _total;
    }

    public void setTotal(double _total) {
        this._total = _total;
    }

    public clscliente getId() {
        return _id;
    }

    public void setId(clscliente _id) {
        this._id = _id;
    }

    public boolean isToString() {
        return toString;
    }

    public void setToString(boolean toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return "clsfactura{" + "_numerofac=" + _numerofac + ", _fecha=" + _fecha + ", _subtotal=" + _subtotal + ", _iva=" + _iva + ", _total=" + _total + ", _id=" + _id + ", toString=" + toString + '}';
    }

    public boolean save(crudfactura cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   
}
