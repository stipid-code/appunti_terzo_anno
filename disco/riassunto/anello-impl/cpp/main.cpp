#include <iostream>
#include "AnelloInteri.hpp"

int main() {
    AnelloInteri* z = new AnelloInteri();
    int tu_mamma = z->somma(5,7);
    tu_mamma = z->somma(tu_mamma, z->getUno());
    std::cout<<tu_mamma<<std::endl;
    return 0;
}
    
