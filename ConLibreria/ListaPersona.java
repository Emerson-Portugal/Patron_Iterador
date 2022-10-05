package ConLibreria;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaPersona {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan"));
        personas.add(new Persona("Pepe"));
        personas.add(new Persona("Juan"));

        System.out.println(mostrar(personas));
    }

    private static String mostrar(ArrayList<Persona> personas) {

        String lista = " ";
        Iterator <Persona> iterator = personas.iterator();

        while(iterator.hasNext()){
            lista += iterator.next().toString();
        }

        return lista;

    }

}
