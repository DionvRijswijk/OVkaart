package ovKaart;

public class OvKaartDriver {

	public static void main(String[] args) {

		OvKaart ovk = new OvKaart(12, true, 3422, false);

		OvKaart ovk2 = new OvKaart(6, true, 3423, false);
		
		OvKaart ovk3 = new OvKaart(90, false, 3424, false);
		
		OvKaart ovk4 = new OvKaart(90, true, 3425, true);
		
		OvKaart ovk5 = new OvKaart(90, false, 3426, true);
		
		OvLocatie loc = new OvLocatie(1.5, 3.3, "neplocatie");
		
		OvLocatie loc2 = new OvLocatie (3.3, 1.5, "nepland");
		
		OvLocatie locthis = new OvLocatie (1.0, 1.0, "nepland");
		OvKaartPaal ovpaal = new OvKaartPaal(10);
		OvKaartPaal ovpaal2 = new OvKaartPaal(5);
		OvKaartPaal ovpaal3 = new OvKaartPaal(20);
		OvKaartPaal ovpaal4 = new OvKaartPaal(15);
		OvKaartPaal ovpaal5 = new OvKaartPaal(2);
		
		//A=loc1.x - nepland.x
		//B=loc1.y - nepland.y
		//CK= loc1 * loc1 + nepland * nepland
		//C=math.sqrt(CK);
		
		ovpaal.inchecken(ovk);
		ovpaal2.inchecken(ovk2);
		ovpaal.inchecken(ovk2);
		ovpaal.inchecken(ovk4);
		ovpaal.inchecken(ovk5);
		System.out.println(ovk2.getSaldo());
	}
}
