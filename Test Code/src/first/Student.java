package first;
/*
 *  Constructor for StudentTester.java
 * @ author Kyle Wilson
 * 
 */
public class Student {

	private String First, Last, degree;
	private int CreditHours;
	private double Gpa;
	
	public Student() {
	}

	public Student(String first, String last, String degree, int creditHours, double d) {
		super();
		First = first;
		Last = last;
		this.degree = degree;
		CreditHours = creditHours;
		Gpa = d;
		//*************************************************************************************************
	}

	public String getFirst() {
		return First;
	}

	public void setFirst(String first) {
		First = first;
	}

	public String getLast() {
		return Last;
	}

	public void setLast(String last) {
		Last = last;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getCreditHours() {
		return CreditHours;
	}

	public void setCreditHours(int creditHours) {
		CreditHours = creditHours;
	}

	public double getGpa() {
		return Gpa;
	}

	public void setGpa(double gpa) {
		
		if (gpa >= 4.0)
			this.Gpa = 4.0;
		
		if (gpa <= 0.0) 
			this.Gpa = 0.0;
		// Makes sure that GPA wont be greater than 4.0 or less than 0.0
	}
	public String toString()
	{
		return "Name: " + First + " " + Last + ", " + degree + ", " + CreditHours + ", " + Gpa;
	}
		

	}
