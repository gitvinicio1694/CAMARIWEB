/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.camariweb.controlador;


import ec.edu.uniandes.octavo.entidades.clsproducto;
import ec.edu.uniandes.octavo.funciones.crudproducto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author VINICIO-DIAZ
 */
@ManagedBean
@ViewScoped
public class cProducto {
    private List<clsproducto> lista;
    private clsproducto newproducto;// cuando ingrese un producto nevo
    private clsproducto selectproducto;//cuando seleccione un producto para borrar

    public cProducto (){
        newproducto = new clsproducto();
        cargardatos();
    }
    private void cargardatos(){
        lista = crudproducto.findbyAll();
    }
     
///////////INSERTAR PRODUCTO////////////////
    private void insertar (){
    if (crudproducto.save(newproducto)){//esta linea guarda el productonuevo
        newproducto = new clsproducto ();//prepara
        cargardatos();
                
    }
    else
    {
}

}
////////////////ELIMINAR PRODUCTO///////////////////
     private void eliminar(){
         if (crudproducto.delete(selectproducto)){
         newproducto = new clsproducto ();//prepara
         cargardatos();
                
    }
    else
    {
             
}
}
///////////////7//ACTUALIZAR PRODUCTO/////////////////
     
    private void actualizar(){
    if (crudproducto.update(selectproducto)){
        newproducto = new clsproducto ();//prepara
        cargardatos();
                
    }
    else
    {

}
}

    public cProducto(List<clsproducto> lista, clsproducto newproducto, clsproducto selectproducto) {
        this.lista = lista;
        this.newproducto = newproducto;
        this.selectproducto = selectproducto;
    }

    public List<clsproducto> getLista() {
        return lista;
    }

    public void setLista(List<clsproducto> lista) {
        this.lista = lista;
    }

    public clsproducto getNewproducto() {
        return newproducto;
    }

    public void setNewproducto(clsproducto newproducto) {
        this.newproducto = newproducto;
    }

    public clsproducto getSelectproducto() {
        return selectproducto;
    }

    public void setSeleproducto(clsproducto selectproducto) {
        this.selectproducto = selectproducto;
    }

  
    
}

