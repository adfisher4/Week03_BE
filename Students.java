package Week03_BE;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName1 = "Tom Morello";
		String studentName2 = "John Frusciante";
		String studentName3 = "John Butler";
		
		String[] students = new String[3];
		
		students[0] = studentName1;
		students[1] = studentName2;
		students[2] = studentName3;
	
	
	for (int i = 0; i < students.length; i++) {
		System.out.println(students[i]);

}
	
	System.out.println("\nAnd now with a for each loop\n");
	
	
	for (String student : students) {
		System.out.println(student);
	}
	}
}
	
