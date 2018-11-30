package io.deephaven.javacppgradletemplate;

import junit.framework.TestCase;

public class MyNamespace1Tests extends TestCase {

    public void testNativeAdd() {
        assertEquals(5.0, MyNamespace1.nativeAdd(3, 2));
    }

    public void testNativeMultiply() {
        assertEquals(5.0, MyNamespace1.nativeAdd(3, 2));
    }

    public void testNativeClass1_1() {
        final MyNamespace1.NativeClass1 c = new MyNamespace1.NativeClass1();
        assertEquals("DEFAULT", c.get_property());
        assertEquals("DEFAULT", c.property());
        c.set_property("TEST");
        assertEquals("TEST", c.property());
    }

    public void testNativeClass1_2() {
        final MyNamespace1.NativeClass1 c = new MyNamespace1.NativeClass1("TEST_DEFAULT");
        assertEquals("TEST_DEFAULT", c.get_property());
        assertEquals("TEST_DEFAULT", c.property());
        c.set_property("TEST");
        assertEquals("TEST", c.property());
    }

    public void testNativeClass2() {
        final MyNamespace1.NativeClass2 c = new MyNamespace1.NativeClass2(3);
        assertEquals(6.0, c.times(2));
    }

}
