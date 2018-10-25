package base;

/**
 *
 * @author ONivia
 */
public class MiLista {
    private Nodo p;
    private Nodo u;
    public int tamano;

    public MiLista() {
        p = null;
        u = null;
        tamano = 0;
    }
    
    private boolean estaVacia() {
        //return (tamano==0);
        return (p==null && u==null);
    }
	
    public Nodo obtenerNodoxPosicion(int posi) {
        Nodo nodoAux = null;
        
        if(posi>=0 && posi<tamano) {
            nodoAux = p;
            if(posi > 0) {
                //recorra la lista buscando la posicion posi
                for(int i = 1; i<=posi; i++) {
                    nodoAux = nodoAux.sgte;                    
                }
            }
        }
        
        return nodoAux;
    }
	
    public void insertarNodoxPosicion(Nodo nodo, int posi) {
        if(estaVacia() && posi==0) { //esta vacia
            p = nodo;
            u = nodo;
            tamano += 1;
        }
        else if(posi>=0 && posi<=tamano) { //cuando la lsita NO esta vacia
            if(posi==0) { //un nuevo 1ero
                nodo.sgte = p;
                p = nodo;
                tamano += 1;                
            }
            else if(posi==tamano) { //un nuevo ultimo
                u.sgte = nodo;
                u = nodo;
                tamano += 1;
            }
            else { //una intermedia
                Nodo nodoAuxAnterior = obtenerNodoxPosicion(posi-1);
                nodo.sgte = nodoAuxAnterior.sgte;
                nodoAuxAnterior.sgte = nodo;
                tamano += 1;
            }
        }            
    }

    public void adicionar(Nodo nodo) {
        insertarNodoxPosicion(nodo, tamano);
    }
    
    public void removerPrimerNodo() {
        if(!estaVacia()) {
            if(tamano==1) { //voy a remover el unico nodo de la lista, la lista kedara vacia
                p = null;
                u = null;                
            }
            else {
                Nodo nodoAux = p.sgte;
                p.sgte = null;
                p = nodoAux;
            }
            tamano -= 1;
        }        
    }

    public Nodo obtenerPrimero() {
        return null;      
    }
    
    public Nodo obteneryRemoverPrimero() {       
        return null;        
    }
    
    public void recorrerLista() {
        Nodo nodoAux = p;
        if(!estaVacia()) {
            for(int i = 0; i < tamano; i++) {
                System.out.println(nodoAux.dato);
                nodoAux = nodoAux.sgte;
            }
        }
    }
}
