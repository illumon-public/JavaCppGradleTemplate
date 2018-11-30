package io.deephaven.javacppgradletemplate;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.annotation.Namespace;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.annotation.StdString;

@Platform(include = {"nativemethods1.h", "NativeClass1.h", "NativeClass2.h"}, link = "cpplib1")
@Namespace("MyNamespace1")
public class MyNamespace1 {

    public static native double nativeAdd(double a, double b);

    public static native double nativeMultiply(double a, double b);


    public static class NativeClass1 extends Pointer {
        static {
            Loader.load();
        }

        public NativeClass1() {
            allocate();
        }

        private native void allocate();

        public NativeClass1(String property) {
            allocate(property);
        }

        private native void allocate(String property);

        // to call the getter and setter functions
        public native @StdString
        String get_property();

        public native void set_property(String property);

        // to access the member variable directly
        public native @StdString
        String property();

        public native void property(String property);
    }


    public static class NativeClass2 extends Pointer {
        static {
            Loader.load();
        }

        public NativeClass2(double v) {
            allocate(v);
        }

        private native void allocate(double v);

        public native double times(double x);
    }

}

