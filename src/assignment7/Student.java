package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {
	private String firstN;
	private String lastN;
	private int ids;
	private int creditsAtt;
	private int creditsPass;
	private double quality;
	private double bal;
	private double value;
	
	public Student(String firstName, String lastName, int id) {
		firstN = firstName;
		lastN = lastName;
		ids = id;
	}

	public String getFullName() {
		return firstN + " " + lastN;	
	}

	public int getId() {
		return ids;
	}

	public void depositBearBucks(double amount) {
		bal += amount;	
	}

	public double getBearBucksBalance() {
		return bal;
	}
}
