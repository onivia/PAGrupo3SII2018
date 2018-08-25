package principal;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        double d1 = 5.01;
        double resultado = (10 + (d1 - 10.01)) / 5 * (d1++ - 0.01);
        //(10 + (5.01 - 10.01)) / 5 * (5.01 - 0.01)  ;d1=6.01
        //(10 - 5.0) / 5 * 5
        //5 / 5 * 5
        //1 * 5.0 = 5.0
        
        //System.out.println(resultado);
        
        int i = 5; //?  10
        int j = 10;
        resultado = 10 * ++i + (j++ * i) / (--j * i); //61
        //10 * (11) + (10 * 11) / (10 * 11)        ;i=11 j=10
        //10 * (i+1) + (10 * (i+1)) / (10 * (i+1))
        //10i + 10 + (10i + 10) / (10i + 10)
        //10i + 10 + 1
        //10i + 11 = 61
        //10i = 61 - 11
        //i = 50 / 10 = 5
        //System.out.println(resultado);
        
        i = -2;
        do {
            System.out.println(i++ * (-2));
            //-2 * -2 = 4  ;i=-1
            //-1 * -2 = 2 ;i=0
        }while(i < 0);
    }    
}
