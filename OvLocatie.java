package ovKaart;

public class OvLocatie {

	private double xpos;
	private double ypos;
	private String naam;
	
	
	public OvLocatie(double xpos, double ypos, String naam) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.naam = naam;
		
		
		
	}
	public double afstandBerekenen(OvLocatie nepland) {
		
	
	double A =0;
	double B =0;
	double C =0;
	double CK =0;
	A= this.xpos - nepland.xpos;
	B= this.ypos - nepland.ypos;
	A=A*A;
	B=B*B;
	CK=A+B;
	C=Math.sqrt(CK);
	return C;
	
	//A=loc1.x - nepland.x
	//B=loc1.y - nepland.y
	//CK= loc1 * loc1 + nepland * nepland
	// (of was het a*a + b*b?...
	//C=math.sqrt(CK);
	}
}
