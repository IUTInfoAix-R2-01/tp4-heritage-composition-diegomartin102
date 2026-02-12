package tp3exosYaip4;

public class Staff extends Person {
	private String school;
	private double pay;

	public Staff(String name,String address, String school, double pay) {
		super(name,address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [name= " + super.getName() +  ", address= " + super.getAddress() + ", school=" + school + ", pay=" + pay + "]";
	}
	
	public static void main(String[] args) {
		//Test constructeur + ToString
		Staff ST1 = new Staff("Jeff","20 rue Vivaldi","IUT AIX",540.0);
		System.out.println(ST1);
		
		//test getter et setters
		ST1.setPay(872.0);
		ST1.setSchool("lycée Jules Ferry");
		System.out.println("Ecole : " + ST1.getSchool());
		System.out.println("Adresse : " + ST1.getPay());
	}
	
}