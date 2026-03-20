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
	}
	
	public void inchecken(double kosten) {
		ingecheckt=true;
		saldo=saldo-kosten;
	
	
	if (geldigheid=true) {
		
		if (ingecheckt=false) {
			
			if (saldo>kosten) {
				
				System.out.print("welkom aanboord");
			}
			else {System.out.print("Niet genoeg saldo");}
		}
		else {System.out.print("Kaart is al ingecheckt");}
	}
	else {System.out.print("Kaart is niet geldig");}
	
	
}}
