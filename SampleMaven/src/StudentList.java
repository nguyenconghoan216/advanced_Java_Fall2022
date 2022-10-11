import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> studentList = new ArrayList<>();

	public StudentList() {
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public ArrayList<Student> addStudent(Student student) {
		getStudentList().add(student);
		return studentList;
	}

	public void searchByName(String name) {
		System.out.println("Result: ");
		ArrayList<Student> list = new ArrayList<>();
		studentList.forEach(x -> {
			if (x.getFirst_name().equals(name.trim())) {
				list.add(x);
			}
		});
		if (list.isEmpty()) {
			System.out.println("Result not found!!");
		} else {
			list.forEach(e -> System.out.println(e));
		}
	}
	

	public void searchByGender(String gender) {
		System.out.println("Result: ");
		ArrayList<Student> list = new ArrayList<>();
		studentList.forEach(e -> {
			if (e.getGender().equals(gender.trim())) {
				list.add(e);
			
			}
		});
		if (list.isEmpty()) {
			System.out.println("Result not found!!");
		} else {
			list.forEach(e -> System.out.println(e));
			
		}
	}

}
