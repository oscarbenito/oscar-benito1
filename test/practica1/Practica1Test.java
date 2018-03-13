
package practica1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oscar
 */
public class Practica1Test {
    
    public Practica1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Casos:
     *      n=0 expResult=1 Todo correcto
     *      n=0 expResult=7 Resultado inesperado
     *      n=3 expResult=6 Todo correcto
     *      n=4 expResult=6 Resultado inesperado
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 0;
        int expResult = 1;
        int result = Practica1.calculo(n);
        if(result==expResult){
            System.out.println("Todo correcto.");
        }else{
            fail("Resultado inesperado.");
        }
        
    }
    
}
