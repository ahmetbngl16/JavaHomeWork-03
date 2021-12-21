
public class StudentManager extends UserManager{
	public void takeCourse(Student student) {
		System.out.println("Take Course -->"+student.getId()+
						   "\nName : "+student.getName()+
						   "\nLast Name : "+student.getLastName()+
				     	   "\n Course Name : "+student.getTakeCourses());
	}
	public void takeCourseMultiple(Student students[]) {
		for(Student student:students) {
			System.out.println("Take Course -->"+student.getId()+
					           "\nName : "+student.getName()+
					           "\nLast Name : "+student.getLastName()+
			     	           "\n Course Name : "+student.getTakeCourses());
}
		}
	@Override
	public void add(User user) {
		System.out.println("Student added -->"+user.getId()+"\nName : "+user.getName()+"\nLast Name : "+user.getLastName());
	}
	@Override
	public void addMultiple(User users[]) {
		for(User user:users) {
			System.out.println("Student added -->"+user.getId()+"\nName : "+user.getName()+"\nLast Name : "+user.getLastName());
		}
	}
	@Override
	public void delete(User user) {
		System.out.println("Student Deleted -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
	}
	@Override
	public void deleteMultiple(User users[]) {
		for(User user:users ) {
		System.out.println("Student Deleted -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
		}
	}
	
	}


