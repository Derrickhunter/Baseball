package baseball;

public class BaseballStatistics {
	
	private String PlayerName;
	
	private int Hits;

	private int AB;

	private int BB;

	private int HBP;

	private int SF;

	private int dbl;

	private int triple;

	private int HR;



public BaseballStatistics(int hits, int aB, int bB, int hBP, int sF, int dbl, int triple, int hR) {

super();

Hits = hits;

AB = aB;

BB = bB;

HBP = hBP;

SF = sF;

this.dbl = dbl;

this.triple = triple;

HR = hR;

}

public int getHits() {

return Hits;

}

public void setHits(int hits) {

Hits = hits;

}

public int getAB() {

return AB;

}

public void setAB(int aB) {

AB = aB;

}

public int getBB() {

return BB;

}

public void setBB(int bB) {

BB = bB;

}

public int getHBP() {

return HBP;

}

public void setHBP(int hBP) {

HBP = hBP;

}

public int getSF() {

return SF;

}

public void setSF(int sF) {

SF = sF;

}

public int getDbl() {

return dbl;

}

public void setDbl(int dbl) {

this.dbl = dbl;

}

public int getTriple() {

return triple;

}

public void setTriple(int triple) {

this.triple = triple;

}

public int getHR() {

return HR;

}

public void setHR(int hR) {

HR = hR;

}

public double SLG()

{

	double BA = H/AB;
	double OBP = (H+BB+HP)/(AB+BB+HP+SF);
	double SLG = (B1+(B2*2)+(B3*3)+(HR*4))/AB;
	double OBS = (OBP+SLG);
	double TB = (B1+(B2*2)+(B3*3)+(HR*4));
	
	System.out.println(PlayerName+" stats: ");
	System.out.println("Batting Average: "+BA);
	System.out.println("On Base Percentage: "+OBP);
	System.out.println("Slugging Percentage: "+SLG);
	System.out.println("On Base Percentage + Slugging Percentage :"+OBS);
	System.out.println("Total Bases:"+TB);
}

}
