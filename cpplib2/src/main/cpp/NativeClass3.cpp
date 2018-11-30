
#include "NativeClass3.h"

namespace MyNamespace2 {

const std::shared_ptr<std::vector<double> > NativeClass3::get_property() {
    return property_;
}

void NativeClass3::set_property(std::shared_ptr<std::vector<double> > property) {
    this->property_ = property;
}

}
