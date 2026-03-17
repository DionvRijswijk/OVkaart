package ovKaart;

public class OvKaart {
	
	
	
	private double saldo=10;
	private boolean geldigheid;
	private int kaartnummer;
	private boolean ingecheckt;
	
	//Constructor
	public OvKaart(double saldo, boolean geldigheid, int kaartnummer, boolean ingecheckt) {
		this.saldo = saldo;
		this.geldigheid = geldigheid;
		this.kaartnummer = kaartnummer;
		this.ingecheckt=ingecheckt;
	
	if (saldo>=10) {
		System.out.println("Welkom aanboord");
	}
	
	else {System.out.println("Niet genoeg saldo");}
	
	}
	
	
}
