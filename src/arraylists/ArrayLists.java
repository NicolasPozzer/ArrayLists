
package arraylists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayLists {

    public static void main(String[] args) {
        
        /*
        =====================================================
        ===============ARRAYLIST y LinkedList================
        =====================================================
        */
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1,"nico ArrayList",23));
        lista.add(new Persona(2,"tuma15 ArrayList",14));
        lista.add(new Persona(3,"tuma17 ArrayList",22));
        lista.add(new Persona(4,"martin ArrayList",21));
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1,"nico Linked",23));
        listaLinked.add(new Persona(2,"tuma15 Linked",14));
        listaLinked.add(new Persona(3,"tuma17 Linked",22));
        listaLinked.add(new Persona(4,"martin Linked",21));
        
        
        /*====Remover en ArrayList=====
        ===============================*/
        lista.remove(1);//El array elimina desde la posicion del indice que se le indica.
        
        
        
        /*====Remover en LinkedList=====
        ===============================*/
        String nombreBorrar = "tuma15 Linked";//El Linked elimina sin saber el indice__
        for(Persona persona2 : listaLinked){  //pero si sabiendo el nombre del elemento__ 
            if(persona2.getNombre().equals(nombreBorrar)){//que queremos eliminar.
                listaLinked.remove(persona2);
                break;//corto para que deje de recorrer.
            }
        }
        
        
        /*====Recorrido por foreach======
        ========Luego de Eliminar========*/
        System.out.println("=======Luego de Eliminar======");
        
        System.out.println("=======ARRAYLIST======");
        for (Persona persona:lista){
            System.out.println("Prueba: "+ persona.getNombre());
        }
        
        System.out.println("=======LINKEDLIST======");
        for (Persona persona:lista){
            System.out.println("Prueba: "+ persona.getNombre());
        }
        

        
        
        
        /*
        =====================================================
        ====================ARRAYLIST========================
        =====================================================
        */
        
        /*
        List<Persona> lista = new ArrayList<Persona> ();
        lista.add(new Persona(1,"nico",23));
        lista.add(new Persona(2,"tuma15",14));
        lista.add(new Persona(3,"tuma17",22));
        lista.add(new Persona(4,"martin",21));
        
        System.out.println("------------FOR CLASICO-------------");
        //recorrer por indice
        for (int i=0; i<lista.size(); i++){
            System.out.println("Prueba: "+ lista.get(i).getNombre());
        }
        
        System.out.println("\n------FOREACH Recorre elemento x elemento-----");
        //Recorrer elemento por elemento con foreach
        for (Persona perso:lista){
            System.out.println("Prueba: "+ perso.getNombre());
        }
        
        
        
        System.out.println("------------FOR CLASICO-------------");
        //recorrer por indice
        for (int i=0; i<lista.size(); i++){
            System.out.println("Prueba: "+ lista.get(i).getNombre());
        }
        
        System.out.println("\n------FOREACH Recorre elemento x elemento-----");
        //Recorrer elemento por elemento con foreach
        for (Persona perso:lista){
            System.out.println("Prueba: "+ perso.getNombre());
        }
        */
        

        
        
        
        
        
    }
}
