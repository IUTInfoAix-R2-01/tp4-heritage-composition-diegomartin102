package cycles;
public class VeloElec extends Velo {
	public static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0 ;
	private double facteurPuissanceMoteur;
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR; 
	}
	
	public VeloElec(double diamRoue, double facteurPuissanceMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = facteurPuissanceMoteur; 
	}
	
	public VeloElec(double braquet,double diamRoue, double facteurPuissanceMoteur) {
		super(braquet,diamRoue);
		this.facteurPuissanceMoteur = facteurPuissanceMoteur; 
	}

	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public double getPuissance(double frequencesCoupsDePedale) {
		return super.getPuissance(frequencesCoupsDePedale)*facteurPuissanceMoteur;
	}
	
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("Braquet par défaut du vélo : " + Velo.getDEFAUT_BRAQUET());
		System.out.println("Puissance du moteur par défaut : " + VeloElec.getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
		setDEFAUT_BRAQUET(4.0);
		setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(18.0);
		
		//création d'un vélo + test toString()
		VeloElec vel2 = new VeloElec(3.0,17.0,4.0);
		System.out.println(vel2);
		
		//test getters
		System.out.println("Braquet du vélo : " + vel2.getBraquet());
		System.out.println("diamètre des roues : " + vel2.getDiamRoue());
		System.out.println("Puissance du vélo : " + vel2.getPuissance(3.0));
		
		//test setters 
		vel2.setBraquet(6.0);
		vel2.setDiamRoue(11.0);
		System.out.println(" ");
		System.out.println("---Test setters---");
		System.out.println("Nouveau Braquet par défaut du vélo : " + Velo.getDEFAUT_BRAQUET());
		System.out.println("Nouvelle Puissance du moteur par défaut : " + VeloElec.getDEFAUT_FACTEUR_PUISSANCE_MOTEUR());
		System.out.println(vel2);
		System.out.println("Braquet du vélo : " + vel2.getBraquet());
		System.out.println("diamètre des roues : " + vel2.getDiamRoue());
		System.out.println("Puissance du vélo : " + vel2.getPuissance(4.0));
	}
	
}