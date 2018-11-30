#ifndef _MYNAMESPACE2_NATIVECLASS1_H_
#define _MYNAMESPACE2_NATIVECLASS1_H_

#include <string>

namespace MyNamespace1 {

    class NativeClass1 {
        public:
            NativeClass1(std::string s) : property(s) {}

            NativeClass1() : property("DEFAULT") {}

            const std::string& get_property() { return property; }

            void set_property(const std::string& p) { this->property = p; }

            std::string property;
    };

}

#endif