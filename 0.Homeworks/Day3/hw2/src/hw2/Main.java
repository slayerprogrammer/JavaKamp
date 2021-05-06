package hw2;

public class Main {
	
	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Tolgahan", "Öztürk", "info@tolgahanozturk.com", "12345", "hw1");
		Student student2 = new Student(2, "Emel", "Öztürk", "info@emeluzunoglu.com", "67890", "hw2");
		
		StudentManager studentManager = new StudentManager();
		
		Student[] students = {student1, student2};
		
		for (Student student : students) {
			studentManager.add(student);
			studentManager.update(student);
			studentManager.delete(student);
		}
		
		System.out.println("--------------------------------------------");
		
		Instructor instructor1 = new Instructor(3,"Engin", "Demirog", "engindemirog@gmail.com", "123456", "description");
		
        Instructor[] instructors = {instructor1};
		
		InstructorManager instructorManager = new InstructorManager();
		
		for (Instructor instructor : instructors) {
			instructorManager.add(instructor);
			instructorManager.update(instructor);
			instructorManager.delete(instructor);
		}
		
	}

}
