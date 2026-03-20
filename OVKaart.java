package ovKaart;

public class OvKaart {

	private double saldo = 10;
	private boolean geldigheid;
	private int kaartnummer;
	private boolean ingecheckt;

	// Constructor
	public OvKaart(double saldo, boolean geldigheid, int kaartnummer, boolean ingecheckt) {
		this.saldo = saldo;
		this.geldigheid = geldigheid;
		this.kaartnummer = kaartnummer;
		this.ingecheckt = ingecheckt;
	}

	public void inchecken(double kosten) {

		ingecheckt = true;
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

}
