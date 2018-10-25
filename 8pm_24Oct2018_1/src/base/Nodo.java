package base;

/**
 *
 * @author ONivia
 */
public class Nodo {
    public int dato;
    public Nodo sgte;

    public Nodo() {
        dato = 0;
        sgte = null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        this.sgte = null;
    }
}
