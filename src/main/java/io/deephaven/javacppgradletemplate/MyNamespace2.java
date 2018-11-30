package io.deephaven.javacppgradletemplate;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.SharedPtr;

@Platform(include = {"<vector>", "NativeClass3.h"}, link = "cpplib2", define = {"SHARED_PTR_NAMESPACE std"})
@Namespace("MyNamespace2")
public class MyNamespace2 {


    public static class NativeClass3 extends Pointer {
        static {
            Loader.load();
        }

        public NativeClass3(@SharedPtr StdDataStructures.StdVecD v) {
            allocate(v);
        }

        private native void allocate(@SharedPtr StdDataStructures.StdVecD v);

        // to call the getter and setter functions
        public native @SharedPtr
        StdDataStructures.StdVecD get_property();

        public native void set_property(@SharedPtr StdDataStructures.StdVecD property);
    }

}

