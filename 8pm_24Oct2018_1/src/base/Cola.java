package base;

import base.MiLista;
import base.Nodo;

/**
 *
 * @author ONivia
 */
public class Cola extends MiLista {
    public Cola() {
        super();
    }
    
    public void encolar(Nodo nodo) {
        super.adicionar(nodo);                
    }
    
    public Nodo desencolar() {        
        return (super.obteneryRemoverPrimero());
    }
    
    public Nodo obtener() {
        return (super.obtenerPrimero());        
    }
}
