/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.octavo.entidades;

/**
 *
 * @author USU-PC
 */
public class clscliente {
     private int _id;
     private int _ruc;
     private String _nombre;
     private String _direccion;

    public clscliente() {
    }

    public clscliente(int _id, int _ruc, String _nombre, String _direccion) {
        this._id = _id;
        this._ruc = _ruc;
        this._nombre = _nombre;
        this._direccion = _direccion;
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getRuc() {
        return _ruc;
    }

    public void setRuc(int _ruc) {
        this._ruc = _ruc;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }

    @Override
    public String toString() {
        return "clscliente{" + "_id=" + _id + ", _ruc=" + _ruc + ", _nombre=" + _nombre + ", _direccion=" + _direccion + '}';
    }

   
}