package porcodio;

public class Diocane {
	public static String dio = "cane";
	// adesso ogni classe che conosce Diocane sa che dio = "cane"
	// dio è una variabile globale

	/**
	 * protected -> public dentro il package, fuori dal package se ne va a fa
	 * n'icculo la visibilità di una classe o è publica o protected, la classe
	 * privata non c'è il modo di usarla le classi private sono inutili, non fanno
	 * niente, sono per stronzi
	 */

	public static String madonna = "puttana";
	// le variabili statiche esistono anche se non esiste nessuna istanza della
	// classe Diocane

	// un utilizzo (abbastanza stupido) di utilizzo di variabile statica è il
	// seguente
	static int DiocaneCount = 0;

	public Diocane() {
		DiocaneCount++;
	}

	public static final String PUTTANA = "tu mamma";

	/**
	 * final -> il runtime environment fa in modo che PUTTANA non possa essere
	 * modificata è una costante costante quindi è maiuscola
	 */

	/**
	 * final serve a ridurre la quantità di test che devo fare tutto quello che non
	 * nasce per essere modificato è meglio che nasca final
	 */

	public static void parla() {
		System.out.println("dio" + dio + " e puttana " + PUTTANA);
	}
	/**
	 * anche i metodi possono essere statici un metodo statico può essere chiamato
	 * anche senza che esistano istanze della classe prima che esista un qualche
	 * Diocane, esisterà sempre Diocane.parla(); molto utile per fare costruttori
	 * statici
	 */
	
	// ricordati che pippo.ammazzati() chiama ammazzati() nel contesto di pippo
	
	int nuts = 10;
	// possiamo fare in due modi per paragonare nuts
	public boolean isBigger(Diocane deez) {
		return this.nuts > deez.nuts;
	}
	
	public static Diocane bigger(Diocane deez, Diocane juicy) {
		if(deez.nuts > juicy.nuts) {
			return deez;
		}
		return juicy;
	}
	
	/**
	 * System è una classe, con molti membri statici
	 * Math, MATH, è una classe, com molti membri statici (diocane)
	 */
	
	/**
	 * Usa i costruttori statici, e considera le conseequensis
	 * 
	 * Ma così non so che succede!
	 * Testa di cazzo! Stiamo astraendo apposta!
	 */
}
