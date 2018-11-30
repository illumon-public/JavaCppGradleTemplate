package io.deephaven.javacppgradletemplate;

import junit.framework.TestCase;

public class StdDataStructuresTests extends TestCase {

    public void testStdVecD() {
        final StdDataStructures.StdVecD v = new StdDataStructures.StdVecD(5);
        assertFalse(v.empty());
        assertEquals(5, v.size());
        v.put(1, 3);
        assertEquals(3.0, v.get(1));
        assertEquals(3.0, v.at(1));

        v.resize(3);
        assertEquals(3, v.size());

        v.put(0, 0);
        v.put(1, 1);
        v.put(2, 2);
        
        final StdDataStructures.StdVecD v2 = new StdDataStructures.StdVecD(2);
        v2.put(0, -1);
        v2.put(1, -2);
        v.put(v2);

        assertEquals(2, v.size());
        assertEquals(-1.0, v.get(0));
        assertEquals(-2.0, v.get(1));
    }
}
