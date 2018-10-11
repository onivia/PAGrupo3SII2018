/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author estudiante
 */
public interface IRepositorio {
    public ServiceRegistry getServiceRegistry();
    
    public SessionFactory getSessionFactory();
    
    public Session getSession();
    
    public void closeSession();    
}
