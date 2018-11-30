
#include "NativeClass2.h"

namespace MyNamespace1 {

NativeClass2::NativeClass2(double v) : val_(v) {}

const double NativeClass2::times(const double x) {
    return x * val_;
}

}
