package archivos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programa {
    public static void main(String[] args) {
        try {
            //Writer            
            FileWriter fw = new FileWriter("C:\\crl\\salida.txt", true); //append
            
//            fw.write(System.lineSeparator() + "Hello team N°5");            
//            fw.write(System.lineSeparator() + "Hello team N°6");
//            fw.flush();
//            fw.close();
            
        } catch (IOException ex) {            
        }
        
        //Reader
        try {            
            String[] lineas = Files.readAllLines(Paths.get("C:\\crl\\salida.txt"), StandardCharsets.UTF_8).toArray(new String[] {});
                                    
            for(String l : lineas) {
                System.out.println(l);                
            }
            
        } catch (IOException ex) {            
        }
    }    
}
