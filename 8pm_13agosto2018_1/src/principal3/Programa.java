package principal3;

public class Programa {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 3) {                        
            System.out.println(i);
            
            i++;
        }
        
        //j scope
        for (int j = 1; j <= 3; j++) {
            System.out.println(i);            
        }
    }    
}
