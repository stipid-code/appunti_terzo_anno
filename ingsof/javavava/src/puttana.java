package Porcodio;

import java.util.ArrayList;

/* doverbbe essere più sullo pseudocodice
 * sarebbe dovuto essere uml ma non so come cazzo fare UML
 */
class Set {
    private ArrayList<Element> elements = new ArrayList();
    public ArrayList violateEncapsulation() {
	return elements;
    }
    public Set addElement(Element element) {
	elements.append(element);
	return this; //permette telescopica
    }
    // unione 
    public Set addSet(Set set) {
	for(Element element: violateEncapsulation(set)) {
	    this.addElement(element);
	}
	return this; //nuts
    }
    public int getSize() {
	// facciamo finta che non esista l'attributo size
	int size = 0;
	for(Element element : elements) {
	    size++;
	}
	return size;
    }
}

/* adesso vogliamo fare una classe funzionalmente equivalente (fa le stesse cose) a
 * Set, ma che ha una perfomrance migliore nel getSize() */

class CounterSet extends Set {
    private int size;
    /* size introduce un'invariante,
     * la dimensione di elements deve essere uguale a size()
     */

    @Override
    public Set addElement(Element element) {
	/* se è implementato come CounterSet chiamerà la funzione di
	 * CounterSet anche se lo chiamo con una reference a Set */
	super.addElement(element);
	this.size++;
	return this;
    }

    @Override
    public Set addSet(Set set) {
	super.addSet(set);
	size += set.getSize();
	return this;
    }

    @Override
    public int getSize() {
	return size;
    }
}

/* questo codice NON FUNZIONA, SI ROMPE
 * abbiamo una gerarchia di classi, con metodi reimplementati.
 * come viene selezionata l'implementazione eseguita a runtime?
 */

class Client {
    public static void main(String args[]) {
	Set set1 = new Set().addElement("Pippo").addElement("Pluto");
	Set set2 = new CounterSet().addElement("Global").addElement("Offensive");

	set2.addSet(set1);
	System.out.println("Puttana la " + set2.getSize());
	// stampa 6, perchè abbiamo incrementato il contatore 2 volte a elemento
    }

    public static void secondary(String args[]) {
	/* in un mondo dove
	 * Class A
	 * Class B extends A
	 * Class C extends B
	 * Class D extends C
	 * A.op() {return 1;}
	 * C.op() {return 2;}
	 */
	A a = new A();
	A b = new B();
	A c = new C();
	A d = new D();

	a.op(); // => restituisce 1
	b.op(); // => restituisce 1
	c.op(); // => restituisce 2
	d.op(); // => restituisce 2
    }
}
