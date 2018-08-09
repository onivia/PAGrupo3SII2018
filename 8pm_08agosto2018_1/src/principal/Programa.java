package principal;

public class Programa {
    public static void main(String[] args) {
        //Precedencia de Operadores
        //se evalua de izq a dere
        //parentesis ()
        //incrementos y decrementos
        //multiplicacion, division o modulo
        //suma y resta
        
        int i = 10;
        int j = 5;
        int r = 5 + 2 * 3 + ++i - 4 + i + j--;
        //i=11; j=4
        //5 + 2 * 3 + 11 - 4 + 11 + 5
        //5 + 6 + 11 - 4 + 11 + 5
        //22 - 4 + 16
        //18 + 16 = 34
        System.out.println(r);
        System.out.println(i);
        System.out.println(j);
    }
}
