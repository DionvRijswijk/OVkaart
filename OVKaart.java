package ovKaart;

public class OvKaart {

	private double saldo = 10;
	private boolean geldigheid;
	private int kaartnummer;
	private boolean ingecheckt;
	private OvLocatie locatie;

	// Constructor
	public OvKaart(double saldo, boolean geldigheid, int kaartnummer, boolean ingecheckt) {
		this.saldo = saldo;
		this.geldigheid = geldigheid;
		this.kaartnummer = kaartnummer;
		this.ingecheckt = ingecheckt;
	}

	public void inchecken(double kosten, OvLocatie locatie) {
// stap 1= variabelen aanmaken om te onthouden waar je bent ingecheckt
// stap 2= locatie moet worden mee gegeven bij het inchecken, net als kosten
// stap 3= pass moet onthouden waar hij is ingecheckt
		ingecheckt = true;
		this.locatie=locatie;
		saldo = saldo - kosten;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean getIngecheckt() {
		// TODO Auto-generated method stub
		return this.ingecheckt;
	}

	public boolean getGeldigheid() {
		// TODO Auto-generated method stub
		return this.geldigheid;
	}
	
	public OvLocatie getlocatie() {
		// TODO Auto-generated method stub
		return this.locatie;
	}
	
	public void uitchecken(double kosten) {
		this.locatie=null;
		saldo=saldo-kosten;
		
		//reistarief krijg je terug?
		//reis kosten van saldo af?
	}

}
