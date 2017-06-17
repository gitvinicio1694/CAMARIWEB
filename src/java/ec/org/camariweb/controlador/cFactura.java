/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.org.camariweb.controlador;


import ec.edu.uniandes.octavo.entidades.clsfactura;
import ec.edu.uniandes.octavo.funciones.crudfactura;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author VINICIO-DIAZ
 */
@ManagedBean
@ViewScoped
public class cFactura {

    private List<clsfactura> lista;
    private  clsfactura newfactura;// cuando ingrese un cleinte nevo
    private clsfactura selectfactura;//cuando seleccione un cliente para borrar
     
    public cFactura() {
         newfactura = new clsfactura ();
         cargardatos();
    }
    private void cargardatos(){
         lista = crudfactura.findbyAll();
    }
///////////////INSERTAR FACTURA//////////////
    private void insertar (){
    if (crudfactura.save(newfactura)){//esta linea guarda el factura nuevo
        newfactura = new clsfactura ();//prepara
        cargardatos();
                
    }
    else
    {
}
}    
///////////////ELIMINAR FACTURA//////////////////
    private void eliminar(){
         if (crudfactura.delete(selectfactura)){
         newfactura = new clsfactura();//prepara
         cargardatos();
                
    }
    else
    {
}
}

    public List<clsfactura> getLista() {
        return lista;
    }

    public void setLista(List<clsfactura> lista) {
        this.lista = lista;
    }

    public clsfactura getNewfactura() {
        return newfactura;
    }

    public void setNewfactura(clsfactura newfactura) {
        this.newfactura = newfactura;
    }

    public clsfactura getSelectfactura() {
        return selectfactura;
    }

    public void setSelectfactura(clsfactura selectfactura) {
        this.selectfactura = selectfactura;
    }
    
}
