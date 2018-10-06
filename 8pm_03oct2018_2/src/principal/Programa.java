package principal;

public class Programa {
    public static void main(String[] args) {
        int tipotercero = 2;
        
        Tercero tercero = Tercero.crearTercero(tipotercero);
        liquidarTercero(tercero);
        
//        if(tipotercero==1) {
//            Cliente c = new Cliente();
//            //mas codigo
//            c.liquidar();
//        } else if(tipotercero==2) {
//            Proveedor p = new Proveedor();
//            //mas codigo
//            p.liquidar();
//            //mas codigo en funcion de como trabajaba liquidar            
//        }
    }
    
    private static void liquidarTercero(Tercero tercero) {
        tercero.liquidar();
    }
    
    private static void calcularRteFte(IRteFte objRteFte) {
        objRteFte.calcularRteFte();
        //aqui mete mas codigo que tenga que ver con calcularRteFte
    }
    
    private static void notificar(INotificable objnotificable) {
        objnotificable.notificar();
    }
}

