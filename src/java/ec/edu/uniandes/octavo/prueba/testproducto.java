/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.uniandes.octavo.prueba;

import ec.edu.uniandes.octavo.entidades.clsproducto;
import ec.edu.uniandes.octavo.funciones.crudproducto;




public class testproducto {
     public static void main(String[] args) {
         
//      
        clsproducto p = new clsproducto(05, "maouse", 40, 30);
         System.out.println(crudproducto.findbyAll());
         System.out.println("aqui");
        crudproducto pro = new crudproducto();
        
        System.out.println("Prueba de clases");
        System.out.println("=============================================");
        System.out.println("contenido de la clase propietario");
        System.out.println(p.toString());
        System.out.println("=============================================");
        System.out.println("=============================================");
        System.out.println("INSERTANDO");
        if (pro.save(p)) {
            System.out.println("Guardado");
        }else{
            System.out.println("error!!!!");
        }
        System.out.println("Comprobando si hay datos");
        //System.out.println(cc.findbyId(po).toString());
        System.out.println("=============================================");
        System.out.println("=============================================");
//        System.out.println("Eliminando");    
//        if (cc.delete(po)) {
//            System.out.println("eliminado");
//        }else{
//            System.out.println("no se ha podido eliminar");
//        }
     }
    
}


