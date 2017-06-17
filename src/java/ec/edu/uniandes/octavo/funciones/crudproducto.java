
package ec.edu.uniandes.octavo.funciones;

import ec.edu.uniandes.octavo.entidades.clsproducto;
import ec.org.uniandes.accesodatos.AccesoDatos;
import ec.org.uniandes.accesodatos.ConjuntoResultado;
import ec.org.uniandes.accesodatos.Parametro;
import java.util.ArrayList;
/**
 *
 * @author VINICIO-DIAZ
 */
public class crudproducto {

    public static ArrayList<clsproducto> finbyAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
/////////////////////////GUARDAR///////////////////////
    
        public static boolean save(clsproducto pro){
        boolean resultado = false;
        String sql = "INSERT INTO public.producto(nombre,stock,precio_venta) VALUES(?,?,?)";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, pro.getNombre()));
        lstPar.add(new Parametro(2, pro.getStock()));
        lstPar.add(new Parametro(3, pro.getPrecio_venta()));
              
        try {
            resultado = AccesoDatos.ejecutaComando(sql, lstPar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
           
        }
        return resultado;
    }
     
///////////////////ELIMINAR///////////////////////////
        
        public static boolean delete(clsproducto pro) {
        boolean res=false;
        String sql = "DELETE FROM public.producto WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1,pro.getIdproducto()));
        try {
            res= AccesoDatos.ejecutaComando(sql, lstPar);
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        return res;
    }

//////////////////////////ACTUALIZAR//////////////////////
        
        public static boolean update(clsproducto pro) {
        boolean res = false;
        String sql = "UPDATE public.producto" +
                "SET nombre=?,stock=?,precio_venta=?" + 
                "WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();        
        lstPar.add(new Parametro(1,pro.getNombre()));
        lstPar.add(new Parametro(2,pro.getStock()));
        lstPar.add(new Parametro(3,pro.getPrecio_venta()));
        lstPar.add(new Parametro(4,pro.getIdproducto()));
        try{
            res= AccesoDatos.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            }
        return res;
    }
////////////////////BUSQUEDA POR TODOS////////////////////////
        
        public  static ArrayList<clsproducto> findbyAll() {
        ArrayList<clsproducto> listado = new ArrayList<>();
        String sql = "SELECT id,  nombre, stock, precio_venta "+
                "FROM public.producto";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            clsproducto producto = null;
            while (cres.next())
            {
                producto = new clsproducto();
                producto.setIdproducto(cres.getInt("id"));
                producto.setNombre(cres.getString("nombre"));
                producto.setStock(cres.getInt("stock"));
                //producto.setPrecio_venta(cres.getDouble("precio_venta"));
                //dfactura.setGenero(cres.getString("genero"));
               // dfactura.setIdpropietario(crudPropietario.findbyId(cres.getInt("idpropietario")));
                listado.add((producto));
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listado;
    }
        
/////////////////BUSQUEDAD POR ID//////////////////////
        
        public clsproducto findbyId(clsproducto pro) {
        clsproducto producto = null;
        String sql = "SELECT id,  nombre, stock, precio_venta FROM public.producto WHERE id=?";
        ArrayList<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, pro.getIdproducto()));
        try {
            ConjuntoResultado cres = AccesoDatos.ejecutaQuery(sql, lstPar);
            while (cres.next()) {
                producto = new clsproducto();
                producto.setIdproducto(cres.getInt("id"));
                producto.setNombre(cres.getString("nombre"));
                producto.setStock(cres.getInt("stock"));
                producto.setPrecio_venta(cres.getDouble("precio_venta"));
                
//                propietario.setIdmascota(crudMascota.findbyId(cres.getInt("idmascota")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return producto;
    }

}

    






