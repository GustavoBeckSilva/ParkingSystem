
package dao;

public interface DataBaseInterface {
    
    public Boolean openConnection();
    public void closeConnection();
    public Object find(Class c, Object id) throws Exception;
    public void persist(Object o) throws Exception;
    public void remove(Object o) throws Exception;
    
}
