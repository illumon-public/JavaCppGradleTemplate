package io.deephaven.javacppgradletemplate;

import junit.framework.TestCase;

public class MyNamespace2Tests extends TestCase {

    public void testNativeClass3() {
        final StdDataStructures.StdVecD v = new StdDataStructures.StdVecD(2);
        v.put(0, 1);
        v.put(1, 2);

        final MyNamespace2.NativeClass3 c = new MyNamespace2.NativeClass3(v);
        assertEquals(2, c.get_property().size());
        assertEquals(1.0, c.get_property().get(0));
        assertEquals(2.0, c.get_property().get(1));

        final StdDataStructures.StdVecD v2 = new StdDataStructures.StdVecD(5);
        c.set_property(v2);
        assertEquals(5, c.get_property().size());
    }

}
