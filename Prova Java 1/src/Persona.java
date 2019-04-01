
public class Persona {
	// Costruttore: inizializza gli attributi nome, cognome, anni
	public Persona(String nome,String cognome,int anno)
	{
		this.nome = nome; //fai riferimento all'attributo nome dell'oggetto corrente
		this.cognome = cognome;
		this.anno = anno;
	}
	
	// questo metodo stampa gli attributi
	public void stampaDati() {
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		System.out.println("Anno di nascita: " + anno + "\n");
	}
	public void stampaDatiCiao() {
		System.out.println("Ciao, mi chiamo " +nome+" "+cognome+" e sono nato nel "+anno+".\n");
	}
		// attributi
		private String nome;
		private String cognome;
		private int anno;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona antonio = new Persona("Antonio","Sedicina",1987); 
		Persona mario = new Persona("Mario","Rossi",1975);
		//stiamo creando l'oggetto antonio
		antonio.stampaDati();
		mario.stampaDati();
		antonio.stampaDatiCiao();
	}

}
