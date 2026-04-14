package ovKaart;

public class OvKaartPaal {

	
	double nogEenLocatiex;
	double nogEenLocatiey;
	double instapTarief;
	
	double kosten = 10;
	OvLocatie locatie; 

	
	public OvKaartPaal(double kosten, OvLocatie nogEenLocatie) {
		this.kosten=kosten;
	    this.locatie=nogEenLocatie;
		
	}
	
	public void uitchecken(OvKaart kaart) {
		double afstand = locatie.afstandBerekenen(kaart.getlocatie());
		//nogEenLocatiex = 17.50;
		//instapTarief = 5;
		kosten=nogEenLocatiex-instapTarief;
//		kaart.uitchecken(afstand);
		
		if (kaart.getGeldigheid() == true) {
			System.out.print("1");
			if (kaart.getIngecheckt() == true) {
				System.out.print("2");
//				if (kaart.getSaldo() > kosten) {

					System.out.print("Uitchecken voltooid");
					System.out.print("3");
					kaart.uitchecken(afstand);
//				} else {
//					System.out.print("Niet genoeg saldo");
				}
			} else {
				System.out.print("Kaart is nog niet ingecheckt");
				System.out.print("4");
			}
		}  {
			System.out.print("Kaart is niet geldig");
			System.out.print("5");
		}
		
	
		
	
	
	// functie die een kaart incheckt

	public void inchecken(OvKaart kaart) {

		if (kaart.getGeldigheid() == true) {
			System.out.print("6");

			if (kaart.getIngecheckt() == false) {
				System.out.print("7");
				if (kaart.getSaldo() > kosten) {
					System.out.print("8");
					System.out.print("welkom aanboord");
					
					kaart.inchecken(kosten, locatie);
				} else {
					System.out.print("9");
					System.out.print("Niet genoeg saldo");
				}
			} else {
				System.out.print("10");
				System.out.print("Kaart is al ingecheckt");
			}
		} else {
			System.out.print("11");
			System.out.print("Kaart is niet geldig");
		}

	}
	
	

}