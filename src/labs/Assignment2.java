package labs;

public class Assignment2 {

	public static void main(String[] args) {

		NewStudent stu1 = new NewStudent("Jane", "127563671");

		stu1.setPhone("0895467879");
		stu1.setCity("Pretoria");
		stu1.setState("Gauteng");

		System.out.println("Phone: " + stu1.getPhone());
		System.out.println("Address: " + stu1.getCity() + ", " + stu1.getState() + "\n");

		stu1.enroll("Math");
		stu1.enroll("English");
		stu1.enroll("Art");
		stu1.showCourses();
		
		stu1.pay(300);
		stu1.checkBalance();
		System.out.println(stu1.toString());

	}

}

class NewStudent {

	private static int id = 1000;
	private String stuID;
	private String ssn;
	private String name;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 300;
	private double balance = 1000;

	public NewStudent(String name, String ssn) {

		this.name = name;
		this.ssn = ssn;
		id++;
		setStudent();
		setEmail();

	}

	private void setStudent() {

		System.out.println("Student name: " + name);

		int random = (int) (Math.random() * (9000 - 1000));
		random = random + 1000;
		stuID = id + random + ssn.substring(5, 9);
		System.out.println("Student ID: " + stuID);

	}

	private void setEmail() {

		email = name.toLowerCase() + id + "@student.com";
		System.out.println("Email: " + email);

	}

	public void enroll(String course) {
		
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
		System.out.print(name + " is now enrolled for " + course + ".\n");

	}

	public void pay(double amount) {

		balance = balance - amount;
		System.out.println();
		System.out.println("\nPaying bill: R" + amount);

	}

	public void checkBalance() {

		System.out.println("Balance: R" + balance);

	}

	public void showCourses() {

		System.out.print("\nCourses:" + courses + "\nPriced at R" + costOfCourse * 3);

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {

		return "\n[Student Name: " + name + "]\n[Student ID: " + stuID + "]\n[SSN: " + ssn + "]\n[Email: " + email
				+ "]";

	}

}
