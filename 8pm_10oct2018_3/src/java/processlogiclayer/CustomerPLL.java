/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processlogiclayer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import repositorio.Customer;
import repositorio.NorthwindFactory;
import repositorio.NorthwindRepositorySingleton;

/**
 *
 * @author ONivia
 */
public class CustomerPLL {
    public CustomerPLL() {
    }
    
    public static Customer obtenerCustomer(String customerid) {
        Logger.getRootLogger().setLevel(Level.ERROR);
                        
        NorthwindFactory repositorioNorthwind = NorthwindRepositorySingleton.getInstancia();
        Customer cust = null;        
        Query query = null;
        
        //SELECT
        query = repositorioNorthwind.getSession().createQuery("FROM Customer WHERE CustomerID = :CustomerID");
        query.setString("CustomerID", customerid);        
        cust = (Customer)query.uniqueResult();
        
        return cust;
    }    
}
