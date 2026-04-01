package ovKaart;

public class OvKaartPaal {

	
	double nogEenLocatiex;
	double nogEenLocatiey;
	
	double kosten = 10;
	

	
	public OvKaartPaal(double kosten, OvLocatie nogEenLocatie) {
		this.kosten=kosten;
		this.nogEenLocatiex=nogEenLocatiex;
		this.nogEenLocatiey=nogEenLocatiey;
		
	}
	// functie die een kaart incheckt

	public void inchecken(OvKaart kaart) {

		if (kaart.getGeldigheid() == true) {

			if (kaart.getIngecheckt() == false) {

				if (kaart.getSaldo() > kosten) {

					System.out.print("welkom aanboord");
					
					kaart.inchecken(kosten);
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