package principal;

public class Programa {
    public static void main(String[] args) {
        int ivar1 = 10;
        
        //step by step
        int[] numeros = new int[2];
        numeros[0] = 100;
        numeros[1] = 200;
        
        //inicializacion explicita
        //[3][2][1]
        int[][][] numeros1 = {
            {
                {10},
                {20}                    
            },
            {
                {30},
                {40}                    
            },
            {
                {50},
                {60}                    
            }
        };
        
        System.out.println(numeros1[1][1][0]);
    }    
}
