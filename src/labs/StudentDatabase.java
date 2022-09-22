package labs;

public class StudentDatabase {

	public static void main(String[] args) {
		// Create a student
		Student stu1 = new Student("Bilal", "24323423");

		stu1.enroll("Math151");
		stu1.enroll("Eng255");
		stu1.enroll("His211");

//		stu1.showCourses();
//		stu1.checkBalance();
		stu1.payTuition(600);
//		stu1.checkBalance();
		System.out.println(stu1.toString());
		
	}

}



class Student{
	// properties
	private static int iD = 0;
	private String userID;
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;
	

	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance;
	
	public Student(String name, String SSN) {
		iD++;
		this.name = name;
		this.SSN = SSN;
		setUserID();
		setEmail();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@fuuastuniversity.com";
		System.out.println("Your email: " + email);
	}
	
	public String getEmail() {
		return email;
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
	
	private void setUserID() {
		int max = 90;
		int min = 10;
		
		int randNum = (int) (Math.random() * (max - min) );
		randNum = randNum + min;
		userID = iD + "" + randNum + SSN.substring(7);
		System.out.println("Your User ID: " + userID);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
	}
	
	public void checkBalance(){
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString() {
		return "[Name: " + name + " ]\n" + "[COURSES: " + courses + "]" + "\n[Balance: " + balance + "]";
	}
	
	
}








































