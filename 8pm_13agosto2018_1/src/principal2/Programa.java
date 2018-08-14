package principal2;

public class Programa {
    public static void main(String[] args) {
        
        int i = 10;
        
        //<,>,<=,>=,!=,==
        if(i == 11) {
            System.out.println("entro al if: " + i);
                        
        }
        else if (i == 20) {
            System.out.println("entro x el else-if: " + i);            
        }
        else {
            System.out.println("enttro x el else: " + i);            
        }
        
        //10
        i = 50;
        switch (i) {
            case 20:
                System.out.println("caso 20: " + i);                
                break;
            case 30:
            case 10:
                System.out.println("caso 10 o 30: " + i);
                break;
            default:
                System.out.println("caso x defecto: " + i);                
                break;
        }
    }    
}
