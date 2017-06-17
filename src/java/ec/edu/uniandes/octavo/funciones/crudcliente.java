/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.octavo.funciones;

import ec.edu.uniandes.octavo.entidades.clscliente;
import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import java.util.ArrayList;



/**
 *
 * @author USU-PC
 */
public class crudcliente {

    static clscliente findbyId(int Int) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /////////////////////GUARDAR///////////////////////
    
        public static boolean save(clscliente cliente){
        boolean resultado = false;
        String sql = "INSERT INTO public.cliente(ruc,nombre,direccion) VALUES(?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cliente.getRuc()));
        lstPar.add(new Parametro(2, cliente.getNombre()));
        lstPar.add(new Parametro(3, cliente.getDireccion()));
         
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
           
        }
        return resultado;
    }
     
     ////////////////////ELIMINAR////////////////////////
        
        public static boolean delete(clscliente cliente) {
        boolean res = false;
        String sql = "DELETE FROM public.cliente WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,cliente.getId()));
        try {
            res = AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        return res;
    }

       ///////////////////ACTUALIZAR//////////////////////
        
        public static boolean update(clscliente cliente) {
        boolean res = false;
        String sql = "UPDATE public.cliente" +
                "SET ruc=?,nombre=?,direccion=?" + 
                "WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();        
        lstPar.add(new Parametro(1,cliente.getRuc()));
        lstPar.add(new Parametro(2,cliente.getNombre()));
        lstPar.add(new Parametro(3,cliente.getDireccion()));
        lstPar.add(new Parametro(4,cliente.getId()));
        try{
            res = AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }
         ////////////BUSQUEDA POR TODOS//////////////////
        
        public  static ArrayList<clscliente> findbyAll() {
        ArrayList<clscliente> listado = new ArrayList<>();
        String sql = "SELECT id, ruc, nombre, direccion "+
                     "FROM public.cliente";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clscliente cliente = null;
            while (cres.next())
            {
                cliente = new clscliente();
                cliente.setId(cres.getInt("id"));
                
                cliente.setRuc(cres.getInt("ruc"));
                cliente.setNombre(cres.getString("nombre"));
                cliente.setDireccion(cres.getString("direccion"));
                //dfactura.setGenero(cres.getString("genero"));
               // dfactura.setIdpropietario(crudPropietario.findbyId(cres.getInt("idpropietario")));
                listado.add((cliente));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
          
          //////////////////BUSQUEDAD POR ID///////////////////
        
        public clscliente findbyId(clscliente cli) {
        clscliente propietario = null;
        String sql = "SELECT id, ruc, nombre, direccion FROM public.cliente WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, cli.getId()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                propietario = new clscliente();
                propietario.setId(cres.getInt("id"));
                propietario.setRuc(cres.getInt("ruc"));
                propietario.setNombre(cres.getString("nombre"));
                propietario.setDireccion(cres.getString("direccion"));
              //propietario.setIdmascota(crudMascota.findbyId(cres.getInt("idmascota")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return propietario;
    }
       
}
