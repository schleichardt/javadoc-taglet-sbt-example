package info.schleichardt;

import example.ImplementationClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Example {

    @Test
    public void testUppercase() throws Exception {
        final ImplementationClass service = new ImplementationClass();
        final String s = "hello";
        assertEquals(service.uppercase(s), s.toUpperCase());
    }

    @Test
    public void testBla() throws Exception {
        final Runnable x = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
                System.out.println(1);
            }
        };
    }
}
