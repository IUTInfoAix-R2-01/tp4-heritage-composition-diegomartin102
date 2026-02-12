package tp3exosYaip4;
public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address,String program,int year,double fee) {
		super(name,address);
		this.year = year;
		this.fee = fee;
		this.program = program;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [name= " + super.getName() + " address= " + super.getAddress() + " program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	
	public static void main(String[] args) {
		//test constructeur + toString
		Student S1 = new Student("Charles","sdf","intéressant", 2,280.0);
		System.out.println(S1);
		
		//Tests getters et setters
		S1.setFee(560.0);
		S1.setProgram("Histoire");
		S1.setYear(3);
		System.out.println("fee : " + S1.getFee());
		System.out.println("year : " + S1.getYear());
		System.out.println("Program : " + S1.getProgram());
	}
	
}