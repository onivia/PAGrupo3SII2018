package principal;
/**
 *
 * @author ONivia
 */
public class Estudiante {
    public int codigo;
    public String nombre;
    public String direccion;
    public String tel;

    public Estudiante() {
    }

    public Estudiante(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Estudiante(int codigo, String nombre, String direccion, String tel) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tel = tel;
    }

    @Override
    public int hashCode() {
        int resultado = 0;
        int primo = 31;
        
        resultado = (primo * codigo) + Integer.hashCode(codigo);
        resultado = (primo * resultado) + nombre.hashCode();
        resultado = (primo * resultado) + direccion.hashCode();
        
        return Math.abs(resultado);
    }

    @Override
    public boolean equals(Object o) {
        boolean sonIguales = false;
        Estudiante otro = null;
        if(o != null && (o instanceof Estudiante)) {
            otro = (Estudiante)o;                        
            
            if(this.codigo == otro.codigo && this.nombre.equals(otro.nombre) && this.direccion.equals(otro.direccion)) {
                sonIguales = true;
            }
        }
        
        return sonIguales;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", tel=" + tel + '}';
    }
}
