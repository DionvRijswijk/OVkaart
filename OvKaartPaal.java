package ovKaart;

public class OvKaartPaal {

	double kosten = 10;
	
	
	//functie die een kaart incheckt
	
	public void inchecken(OvKaart saldo) {
		saldo.inchecken(kosten);
		ingecheckt = true;
		saldo=saldo-kosten;
		
		if (saldo>=kosten) {
			System.out.println("Welkom aanboord");}
	}
	{
	
	}
}
