/* l'anello è una definizione estremamente astratta, e lo facciamo quindi come
 * classe puramente virtuale */

template<typename elemento>
class Anello {
public:
    virtual elemento getZero() const = 0;
    virtual elemento getUno() const = 0;
    virtual elemento somma(elemento, elemento) const = 0;
    virtual elemento prodotto (elemento, elemento) const = 0;
};
