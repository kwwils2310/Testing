package first;
/*
* @author Kyle Wilson
*
*Driver for Student Class
*/
public class StudentTester {

	public static void main(String[] args) {
		Student s1 = new Student("Kyle", "Wilson", "CS", 120, 3.5);
		System.out.println(s1);
		s1.setGpa(4.5);
		System.out.println("GPA: " + s1.getGpa());
		Student s2 = new Student("Bob", "Smith", "CIS", 110, 3.4);
		System.out.println(s2);
		s2.setCreditHours(115);
		System.out.println("Credit Hours: " + s2.getCreditHours());
		
	}
	
}
