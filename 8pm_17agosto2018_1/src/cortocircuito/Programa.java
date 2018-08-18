package cortocircuito;

public class Programa {
    public static void main(String[] args) {
        
        int i = 10;
        
        if(i == 20 & plusI(i) == 11) {
            System.out.println("entro al if"); //NO
        }
    }

    private static int plusI(int i) {
        System.out.println("incremento a I");  //NO --SI
        
        return (++i);
    }
    
    //if(nombres != null && nombres.count > 0)...
    //if(nombres != null)
        //if(nombres.count > 0)
}
