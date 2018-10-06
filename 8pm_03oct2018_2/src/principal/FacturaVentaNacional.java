package principal;

/**
 *
 * @author ONivia
 */
public class FacturaVentaNacional extends Factura implements IRteFte {
    public FacturaVentaNacional() {
    }
    
    @Override
    public void calcularRteFte() {
        System.out.println("se calculo RteFte a la FVN");        
    }
}
