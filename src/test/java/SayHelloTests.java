import org.junit.Test;
import static org.junit.Assert.*;

public class SayHelloTests {

    // These example test cases are editable, feel free to add
    // your own tests to debug your code.

    @Test
    public void shouldSayHello() {
        assertEquals("Hello, Qualified!", Challenge.sayHello("Qualified"));
    }

    @Test
    public void shouldSayHelloThereWhenEmpty() {
        assertEquals("Hello there!", Challenge.sayHello(""));
    }

    @Test
    public void shouldSayHelloWhenNull() {
        assertEquals("Hello there!", Challenge.sayHello(null));
    }
}