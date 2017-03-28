import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Freakanomic on 3/28/17.
 */
public class HelloWorldTest {
    @Before
    public void setUp(){
        System.out.println("Initializing the program");
    }
    @Test
    public void hello(){
        System.out.println("Hello World");
    }
    @After
    public void tearDown(){
        System.out.println("Program has reached the climax");
    }

}
