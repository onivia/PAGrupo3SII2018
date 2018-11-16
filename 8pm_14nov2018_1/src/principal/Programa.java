package principal;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        int b = 4;        
        int[] numeros = {2,4,6,8,10,12};
        int r = obtienePosicionNumeroBuscado(numeros, b, 0, numeros.length-1);
        System.out.println(r);
    }
    
    private static int obtienePosicionNumeroBuscado(int[] numeros, int b, int inf, int sup) {
        int r = 0;
        int m = ((sup - inf) / 2) + inf;
        
        if(b<numeros[inf] || b>numeros[sup])
            return -1;
        
        if(b<numeros[m]) {
            r = obtienePosicionNumeroBuscado(numeros, b, inf, m-1);            
            return r;
        }
        else if(b>numeros[m]) {
            r = obtienePosicionNumeroBuscado(numeros, b, m+1, sup);
            return r;
        }
        else
            return m;
    }
}
