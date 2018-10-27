package base;

/**
 *
 * @author ONivia
 */
public class Pila extends MiLista {
    public Pila() {
        super();
    }
    
    public void apilar(Nodo nodo) {
        super.insertarPrimero(nodo);
    }
    
    public Nodo desapilar() {
        return (super.obteneryRemoverPrimero());
    }
    
    public Nodo obtener() {
        return (super.obtenerPrimero());
    }
}
