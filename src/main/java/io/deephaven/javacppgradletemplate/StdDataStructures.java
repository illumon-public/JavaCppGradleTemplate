package io.deephaven.javacppgradletemplate;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.*;

@Platform(include = "<vector>")
public class StdDataStructures {

    @Name("std::vector<double>")
    public static class StdVecD extends Pointer {
        static {
            Loader.load();
        }

        public StdVecD() {
            allocate();
        }

        public StdVecD(long n) {
            allocate(n);
        }

        private native void allocate();

        private native void allocate(long n);

        @Name("operator=")
        public native @ByRef
        StdDataStructures.StdVecD put(@ByRef StdDataStructures.StdVecD x);

        @Index
        public native double get(@Cast("size_t") long n);

        public native double at(long n);

        public native void put(@Cast("size_t") long i, double v);

        public native long size();

        public native @Cast("bool")
        boolean empty();

        public native void resize(long n);

    }

}
