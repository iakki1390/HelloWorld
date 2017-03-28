import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Freakanomic on 3/28/17.
 */
public class HelloWorldTest {
    @Before
    public void setUp(){
        //Before Annotation
        System.out.println("Initializing the program");
    }
    @Test
    public void hello(){
        //Test Annotation
        System.out.println("Hello World");
    }
    @After
    public void tearDown(){
        //After Annotation
        System.out.println("Program has reached the climax");
    }

}
