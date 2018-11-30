#ifndef _MYNAMESPACE1_NATIVECLASS2_H_
#define _MYNAMESPACE1_NATIVECLASS2_H_

namespace MyNamespace1 {

    class NativeClass2 {
        public:
            NativeClass2(double v);

            const double times(double x);

        private:
            const double val_;
    };

}

#endif