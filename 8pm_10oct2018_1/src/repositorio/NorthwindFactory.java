/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author ONivia
 */
public class NorthwindFactory implements IRepositorio {
    private ServiceRegistry serviceRegistry;
    private SessionFactory sessionFactory;
    private Configuration configuration;
    private Session session;
    public static final String HBCONFIGURATIONFILEDEAFAULT = "\\repositorio\\hibernate.cfg.xml";
    private String hbConfigurationFile;
    
    private NorthwindFactory(NorthwindFactoryBuilder northwindFactoryBuilder) {        
        this((northwindFactoryBuilder.hbConfigurationFile.length() > 0) ? northwindFactoryBuilder.hbConfigurationFile : HBCONFIGURATIONFILEDEAFAULT);
                
        if(northwindFactoryBuilder.sesionAbierta && sessionFactory != null) {
            this.session = sessionFactory.openSession();
        }
    }

    private NorthwindFactory(String hbConfigurationFile) {        
        this.hbConfigurationFile = hbConfigurationFile;
        
        configuration = new Configuration();
        configuration.configure(this.hbConfigurationFile);
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
    
    @Override
    public ServiceRegistry getServiceRegistry() {
        return serviceRegistry;
    }
    
    @Override
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    @Override
    public Session getSession() {
        return session;
    }
    
    @Override
    public void closeSession() {
        session.close();
        sessionFactory.close();
        StandardServiceRegistryBuilder.destroy(serviceRegistry);
    }
    
    public static class NorthwindFactoryBuilder {
        private String hbConfigurationFile;
        private boolean sesionAbierta;
        
        public NorthwindFactoryBuilder hbConfigurationFile(String hbConfigurationFile) {
            this.hbConfigurationFile = hbConfigurationFile;
            return this;
        }
        
        public NorthwindFactoryBuilder abrirSesion() {
            this.sesionAbierta = true;
            return this;
        }
        public NorthwindFactory build() {
            return new NorthwindFactory(this);
        }
    }
}

