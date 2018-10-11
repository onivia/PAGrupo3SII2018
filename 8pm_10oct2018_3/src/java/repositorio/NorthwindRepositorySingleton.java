/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

/**
 *
 * @author estudiante
 */
public class NorthwindRepositorySingleton {
    private static NorthwindFactory instancia = null;
        
    public static NorthwindFactory getInstancia() {
        if (instancia == null) {
            instancia = getInstancia(NorthwindFactory.HBCONFIGURATIONFILEDEAFAULT);
        }
        
        return instancia;
    }
    
    public static NorthwindFactory getInstancia(String hbConfigurationFile) {
        if (instancia == null) {
            instancia = new NorthwindFactory.NorthwindFactoryBuilder()
                        .hbConfigurationFile(hbConfigurationFile)
                        .abrirSesion()
                        .build();
        }
        
        return instancia;
    }    
}
