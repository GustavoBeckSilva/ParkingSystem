/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import dao.JPAPersistance;
import model.VehicleModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ConnectionTest {
   
    JPAPersistance jpa = new JPAPersistance();    
    
    public ConnectionTest() {
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
      
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        if(jpa.openConnection())
            System.out.println("Conexão aberta.");
            
        else
            System.out.println("Erro ao abrir a conexão.");
    }
    
    @After
    public void tearDown() {
        jpa.closeConnection();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        VehicleModel vm = new VehicleModel();
        
        vm.setVehicleModelDescription("JAVACAR");
        
        try{
            jpa.persist(vm);
        }
        catch(Exception e){
            
        }
    }
}
