

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    private Property property1;
    private String description = "T3 Monte Belo";
    private double price = 150000.0;
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
    }
    
    @Test
    public void testConstructor(){
        // Criação do objeto Property
        
        assertEquals(this.price, this.property1.getPrice());
        assertEquals(this.description, this.property1.getDescription());
    }

    @Test
    public void testToString(){
        assertEquals("Descricao : " + this.description + "\nPreco : " + this.price, property1.toString());
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        this.property1 = new Property(description, price);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
