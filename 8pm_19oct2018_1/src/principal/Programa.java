package principal;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        //pruebaStatic();
        pruebaInmutable();        
    }
    
    private static void pruebaStatic() {
        Global.var1 = 100;
        
        System.out.println(Global.var1);
        
        ClaseA ca = new ClaseA();
        ca.actualizaValorVar1(200);
        
        System.out.println(Global.var1);
    }
    
    private static void finalVariables() {
        final int i = 10;
        
        final ClaseA ca = new ClaseA();
        
        ca.edad = 50;
        ca.edad = 100;
        
        //ca = new ClaseA();
        finalParametro(ca);
    }
    
    private static void finalParametro(final ClaseA ca) {
        ca.edad = 50;
        ca.edad = 100; 
        
        //ca = new ClaseA();
    }
    
    private static void pruebaInmutable() {
        String s1 = "hola";
        String s2 = new String("hola");
        
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
