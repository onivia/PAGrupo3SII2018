package principal;

/**
 *
 * @author ONivia
 */
public class FacturaExportacion extends Factura implements INotificable {

    public FacturaExportacion() {
    }

    public void calcularRteFte() {
        
    }

    @Override
    public void notificar() {
        System.out.println("se notifico la FEx");
    }
}
