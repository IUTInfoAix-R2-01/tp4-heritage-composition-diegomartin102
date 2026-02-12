package cycles;
import java.util.Random;
public class Velo {
	private static double DEFAUT_BRAQUET = 1.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea ;
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		Velo.DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public Velo() {
		braquet = DEFAUT_BRAQUET;
		double diamroue = 15.0; 
		genAlea = new Random();
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
		double diamroue = 15.0;
		genAlea = new Random();
	}

	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		genAlea = new Random();
	}

	public double getBraquet() {
		return braquet;
	}

	public double getDiamRoue() {
		return diamRoue;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}

	public double getPuissance(double frequencesCoupsdePedale) {
		return frequencesCoupsdePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}

	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}

	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("Braquet par défaut du vélo : " + Velo.getDEFAUT_BRAQUET());
		setDEFAUT_BRAQUET(4.0);
		
		//création d'un vélo + test toString()
		Velo vel1 = new Velo(2.0,13.0);
		System.out.println(vel1);
		
		//test getters
		System.out.println("Braquet du vélo : " + vel1.getBraquet());
		System.out.println("diamètre des roues : " + vel1.getDiamRoue());
		System.out.println("Puissance du vélo : " + vel1.getPuissance(3.0));
		
		//test setters 
		vel1.setBraquet(3.0);
		vel1.setDiamRoue(14.0);
		System.out.println(" ");
		System.out.println("---Test setters---");
		System.out.println("Braquet par défaut du vélo : " + Velo.getDEFAUT_BRAQUET());
		System.out.println(vel1);
		System.out.println("Braquet du vélo : " + vel1.getBraquet());
		System.out.println("diamètre des roues : " + vel1.getDiamRoue());
		System.out.println("Puissance du vélo : " + vel1.getPuissance(3.0));
	}

	
}

