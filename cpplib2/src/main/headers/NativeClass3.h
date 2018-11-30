#ifndef _MYNAMESPACE2_NATIVECLASS3_H_
#define _MYNAMESPACE2_NATIVECLASS3_H_

#include <string>
#include <vector>
#include <memory>

namespace MyNamespace2 {

    class NativeClass3 {
        public:
            NativeClass3(std::shared_ptr<std::vector<double> > v) : property_(v) {}

            const std::shared_ptr<std::vector<double> > get_property();

            void set_property(std::shared_ptr<std::vector<double> > property);

        private:
            std::shared_ptr<std::vector<double> > property_;
    };

}

#endif