package principal;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Transaction;
import repositorio.Customer;
import repositorio.NorthwindFactory;
import repositorio.NorthwindRepositorySingleton;

/**
 *
 * @author ONivia
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pruebaHibernate_Customer();
    }
    
    private static void pruebaHibernate_Customer() {
        Logger.getRootLogger().setLevel(Level.ERROR);
                        
        NorthwindFactory repositorioNorthwind = NorthwindRepositorySingleton.getInstancia();
        Customer cust = null;        
        Query query = null;
        
        //SELECT
        query = repositorioNorthwind.getSession().createQuery("FROM Customer WHERE CustomerID = :CustomerID");
        query.setString("CustomerID", "BOLID");        
        cust = (Customer)query.uniqueResult();
        
        //UPDATE
        Transaction tran = repositorioNorthwind.getSession().beginTransaction();
            cust.setCity("Cartagena");
            repositorioNorthwind.getSession().update(cust);            
            //repositorioNorthwind.getSession().save(cust); insertar
            //repositorioNorthwind.getSession().delete(cust); borrar
        tran.commit();
        
        repositorioNorthwind.closeSession();
        
        //System.out.println(cust.getContactName());        
    }    
}
