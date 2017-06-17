package ec.org.camariweb.controlador;


import ec.edu.uniandes.octavo.entidades.clscliente;
import ec.edu.uniandes.octavo.funciones.crudcliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class cCLiente {
    private List<clscliente> lista;
    private  clscliente newcliente;// cuando ingrese un cleinte nevo
    private clscliente selectedcliente;//cuando seleccione un cliente para borrar

    public cCLiente() {
        newcliente = new clscliente ();
        cargardatos();
    }
    
    private void cargardatos(){
         lista = crudcliente.findbyAll();
    }
     
 /////////////INSERTAR CLIENTE///////////////
    private void insertar (){
    if (crudcliente.save(newcliente)){//esta linea guarda el cliente nuevo
       newcliente = new clscliente ();//prepara
       cargardatos();
                
    }
    else
    {
}
}
/////////////////ELIMINAR CLIENTE///////////////////
    private void eliminar(){
    if (crudcliente.delete(selectedcliente)){
        newcliente = new clscliente ();//prepara
        cargardatos();
                
    }
    else
    {
             
}
}
////////////////ACTUALIZAR CLIENTE //////////////
     
    private void actualizar(){
    if (crudcliente.update(selectedcliente)){
        newcliente = new clscliente ();//prepara
        cargardatos();
                
    }
    else
    {

}
}

    public cCLiente(List<clscliente> lista, clscliente newcliente, clscliente selectedcliente) {
        this.lista = lista;
        this.newcliente = newcliente;
        this.selectedcliente = selectedcliente;
    }

    public List<clscliente> getLista() {
        return lista;
    }

    public void setLista(List<clscliente> lista) {
        this.lista = lista;
    }

    public clscliente getNewcliente() {
        return newcliente;
    }

    public void setNewcliente(clscliente newcliente) {
        this.newcliente = newcliente;
    }

    public clscliente getSelectedcliente() {
        return selectedcliente;
    }

    public void setSelectedcliente(clscliente selectedcliente) {
        this.selectedcliente = selectedcliente;
    }

  
    
}
