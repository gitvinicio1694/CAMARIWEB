/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.octavo.entidades;

import ec.edu.uniandes.octavo.funciones.crudproducto;

/**
 *
 * @author USU-PC
 */
public class clsproducto {
    private int _idproducto;
    private String _nombre;
    private int _stock;
    private double _precio_venta;

    public clsproducto() {
    }

    public clsproducto(int _idproducto, String _nombre, int _stock, double _precio_venta) {
        this._idproducto = _idproducto;
        this._nombre = _nombre;
        this._stock = _stock;
        this._precio_venta = _precio_venta;
    }

    public int getIdproducto() {
        return _idproducto;
    }

    public void setIdproducto(int _idproducto) {
        this._idproducto = _idproducto;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getStock() {
        return _stock;
    }

    public void setStock(int _stock) {
        this._stock = _stock;
    }

    public double getPrecio_venta() {
        return _precio_venta;
    }

    public void setPrecio_venta(double _precio_venta) {
        this._precio_venta = _precio_venta;
    }

    @Override
    public String toString() {
        return "clsproducto{" + "_idproducto=" + _idproducto + ", _nombre=" + _nombre + ", _stock=" + _stock + ", _precio_venta=" + _precio_venta + '}';
    }

    public boolean save(crudproducto cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
