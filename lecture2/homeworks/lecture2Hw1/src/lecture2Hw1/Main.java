package lecture2Hw1;

public class Main {
	
	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor("Engin Demiro�", "MCT,PMP,ITIL");
		
		Course course1 = new Course("C# + Angular", "2 ay s�recek yaz�l�m geli�tirici yeti�tirme kamp�", instructor1.name, 0);
		Course course2 = new Course("Java + React", "2 ay s�recek yaz�l�m geli�tirici yeti�tirme kamp�", instructor1.name, 0);
		Course course3 = new Course("Programlamaya Giri� i�in Temel Kurs", "T�m programlama dilleri i�in temel programlama mant���", instructor1.name, 0);
		
		CourseManager courseManager = new CourseManager();
		courseManager.joinCourse(course1);
		courseManager.joinCourse(course2);
		courseManager.signupForFree(course3);
		
		
	}

}
