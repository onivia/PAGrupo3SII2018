package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        //pruebaList();
        //pruebaSet();
        pruebaMap();
    }
    
    private static void pruebaList() {
        List<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante(100, "Sergio", "A"));
        estudiantes.add(new Estudiante(200, "Camilo", "B"));
        
        //System.out.println(estudiantes.get(0).hashCode());
        //System.out.println(estudiantes.get(1).hashCode());
        
        System.out.println(estudiantes.contains(new Estudiante(200, "Camilo", "B")));
        
//        for(Estudiante e : estudiantes) {
//            System.out.println(e);
//        }
    }
    
    private static void pruebaSet() {
        Set<Estudiante> estudiantes = new HashSet<>();
        
        estudiantes.add(new Estudiante(100, "Sergio", "A", "100"));
        estudiantes.add(new Estudiante(200, "Camilo", "B", "200"));
        estudiantes.add(new Estudiante(300, "Camilo", "C", "300"));
        
        System.out.println(estudiantes.contains(new Estudiante(300, "Camilo", "C")));
        
//        for(Estudiante e : estudiantes) {
//            System.out.println(e);
//        }
    }
    
    private static void pruebaMap() {
        Map<Integer,Estudiante> estudiantes = new HashMap<>();
        
        estudiantes.put(100, new Estudiante(100, "Sergio", "A", "100"));
        estudiantes.put(200, new Estudiante(200, "Camilo", "B", "200"));
        estudiantes.put(300, new Estudiante(300, "Camilo", "C", "300"));
        estudiantes.put(400, new Estudiante(400, "Camilo", "D", "400"));
        
        System.out.println(estudiantes.get(300));
        
//        for(Map.Entry<Integer,Estudiante> m : estudiantes.entrySet()) {
//            System.out.println("key=" + m.getKey() + " ,value=" + m.getValue());                                    
//        }
    }
}
