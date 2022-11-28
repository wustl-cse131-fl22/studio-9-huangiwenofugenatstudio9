package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions

	private final Map<String, Student> map;

	
	public UniversityDatabase() {
		map = new HashMap<>();
	}

	public void addStudent(String accountName, Student student) {
		map.put(accountName, student);
	}

	public int getStudentCount() {
		int key = map.size();
		return key;
	}

	public String lookupFullName(String accountName) {
		if(map.get(accountName) == null) {
			return null;
		}
		String s = map.get(accountName).getFullName();
		return s;
	}

	public double getTotalBearBucks() {
		double z = 0;
		for(String s: map.keySet()) {
			z += map.get(s).getBearBucksBalance();
		}
		return z;
	}
}
