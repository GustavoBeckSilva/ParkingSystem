
package dao;

import javax.persistence.*;

public class JPAPersistance implements DataBaseInterface{
    
    EntityManager entity;
    EntityManagerFactory factory;
    
    public JPAPersistance(){
        factory = Persistence.createEntityManagerFactory("pu_parking_system");
        entity = factory.createEntityManager();
    }

    @Override
    public Boolean openConnection() {
          return entity.isOpen();
    }

    @Override
    public void closeConnection() {
          entity.close();
    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void persist(Object o) throws Exception {
        EntityManager entity =  getEntityManager();
        entity.getTransaction().begin();
        entity.persist(o);
        entity.getTransaction().commit();
    }

    @Override
    public void remove(Object o) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public EntityManager getEntityManager(){
        if(entity == null || !entity.isOpen())
            entity = factory.createEntityManager();
        
        return entity;
    }

    
    
    
}
