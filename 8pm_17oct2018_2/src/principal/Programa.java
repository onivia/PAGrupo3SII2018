package principal;

import java.net.MalformedURLException;
import java.net.URL;
import wservicio.WsPrueba1;
import wservicio.WsPrueba1_Service;

/**
 *
 * @author ONivia
 */
public class Programa {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/8pm_17oct2018_1/wsPrueba1?wsdl");
            WsPrueba1_Service ws = new WsPrueba1_Service(url);
            WsPrueba1 port = ws.getWsPrueba1Port();
            String respuesta = port.echoPrueba("yo keria ir a la fiesta! y el profe NO dejo!");
            System.out.println(respuesta);
        } catch (MalformedURLException malformedURLException) {
        }
    }
    
}
