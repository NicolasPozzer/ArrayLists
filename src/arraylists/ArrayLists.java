
package arraylists;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists {

    public static void main(String[] args) {
        
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
        
    }
}
