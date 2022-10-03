#include "anello.hpp"

class AnelloInteri : public Anello<int> {
public:
    virtual int getZero() const {
	return 0;
    }
    virtual int getUno() const {
	return 1;
    }
    virtual int somma(int a, int b) const {
	return a+b;
    }
    virtual int prodotto(int a, int b) const {
	return a*b;
    }
};
