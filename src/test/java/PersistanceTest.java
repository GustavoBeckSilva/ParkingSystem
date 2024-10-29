
import dao.JPAPersistance;
import model.VehicleModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersistanceTest {
    
    JPAPersistance jpa = new JPAPersistance();    
    
    public PersistanceTest() {
    }

   
    
    @BeforeEach
    public void setUp() {
        jpa.openConnection();
    }
    
    @AfterEach
    public void tearDown() {
        jpa.closeConnection();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void persistanceTest() {
         VehicleModel m = new VehicleModel();
         m.setVehicleModelDescription("Chevette");
         m.setVehicleModelId(1);
         
         try{
             jpa.persist(m);
         }
         catch(Exception e){
             System.err.println(m);
         }
     
     }
}
