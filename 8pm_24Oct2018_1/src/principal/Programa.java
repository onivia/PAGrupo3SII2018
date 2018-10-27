
package principal;

import base.Cola;
import base.MiLista;
import base.Nodo;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        //pruebaMiLista();
        pruebaCola();
    }
    
    private static void pruebaMiLista() {
        MiLista lista = new MiLista();
//        lista.insertarNodoxPosicion(new Nodo(2),0);
//        lista.insertarNodoxPosicion(new Nodo(8),1);
//        lista.insertarNodoxPosicion(new Nodo(6),2);
//        lista.insertarNodoxPosicion(new Nodo(4),3);
//        lista.adicionar(new Nodo(2));
//        lista.adicionar(new Nodo(8));
//        lista.adicionar(new Nodo(6));
//        
//        //lista.insertarPrimero(new Nodo(4));                          
//        //System.out.println(lista.obteneryRemoverPrimero().dato);
//        
//        lista.obteneryRemoverPrimero();
//        lista.recorrerLista();
    }

    private static void pruebaCola() {
        Cola cola = new Cola();
        cola.encolar(new Nodo(8));
        cola.encolar(new Nodo(4));
        cola.encolar(new Nodo(2));
        
        cola.desencolar();
        cola.desencolar();
        System.out.println(cola.obtener().dato);
    }
}
