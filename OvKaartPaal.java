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

			if (kaart.getIngecheckt() == true) {

//				if (kaart.getSaldo() > kosten) {

					System.out.print("Uitchecken voltooid");
					
					kaart.uitchecken(afstand);
//				} else {
//					System.out.print("Niet genoeg saldo");
				}
			} else {
				System.out.print("Kaart is nog niet ingecheckt");
			}
		}  {
			System.out.print("Kaart is niet geldig");
		}
		
	
	
	
	
	// functie die een kaart incheckt

	public void inchecken(OvKaart kaart) {

		if (kaart.getGeldigheid() == true) {

			if (kaart.getIngecheckt() == false) {

				if (kaart.getSaldo() > kosten) {

					System.out.print("welkom aanboord");
					
					kaart.inchecken(kosten, locatie);
				} else {
					System.out.print("Niet genoeg saldo");
				}
			} else {
				System.out.print("Kaart is al ingecheckt");
			}
		} else {
			System.out.print("Kaart is niet geldig");
		}

	}

}