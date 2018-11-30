package hello;

import junit.framework.TestCase;

public class HelloWorldTests extends TestCase {

    public void testSayHello() {
        assertEquals("Hello world!", new HelloWorld().sayHello());
    }
}

