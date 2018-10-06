package principal;

/**
 *
 * @author ONivia
 */
public class Cliente extends Tercero implements INotificable {
    public Cliente() {
        super();
    }
    
    public void cuentasxCobrar() {
        System.out.println("cuentasxCobrar en Cliente");
    }

    @Override
    public void liquidar() {
        System.out.println("liquidar en Cliente");
    }

    @Override
    public void notificar() {
        System.out.println("se notifico al Cliente");
    }
}
