

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    private Company company1;
    private User client1, client2, seller1, seller2;
    public CompanyTest()
    {
    }
    
    

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        this.company1 = new Company();
        this.client1 = new User("Jose Manuel", "911111111", "zemanel@yahoo.com");
        this.client2 = new User("António Francisco", "922222222", "zemanel@yahoo.com");
        this.seller1 = new User("Fernando Fernandes", "966777101", "zemanel@yahoo.com");
        this.seller2 = new User("Rodrigo Rodrigues", "966777152", "zemanel@yahoo.com");
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
