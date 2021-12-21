
public class InstructorManager extends UserManager{
	
	//Kurs adýný eklemek için ilk parametrede eðitmen nesnesi ikinci parametrede kursun adý girilmedir.
	
	public String addCourseName(Instructor ýnstructor,String courseName) {
		ýnstructor.setHisCourses(courseName);
		return ýnstructor.getHisCourses();
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println("Instructor Id -->"+instructor.getId()+
						   "\nName : "+instructor.getName()+
						   "\nLast Name : "+instructor.getLastName()+
				     	   "\n Course Name : "+instructor.getHisCourses()+" The Course has been added");
	}
	public void addCourseMultiple(Instructor instructors[]) {
		for(Instructor instructor:instructors) {
			System.out.println("Instructor Id -->"+instructor.getId()+
					           "\nName : "+instructor.getName()+
					           "\nLast Name : "+instructor.getLastName()+
			     	           "\n Course Name : "+instructor.getHisCourses()+" The Course has been added");
		}
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println("Instructor Id -->"+instructor.getId()+
				           "\nName : "+instructor.getName()+
				           "\nLast Name : "+instructor.getLastName()+
		     	           "\n Course Name : "+instructor.getHisCourses()+" The Course has been deleted");
    }
	public void deleteCourseMultiple(Instructor instructors[]) {
		for(Instructor instructor : instructors) {
			System.out.println("Instructor Id -->"+instructor.getId()+
			           		   "\nName : "+instructor.getName()+
			           	       "\nLast Name : "+instructor.getLastName()+
			           		   "\n Course Name : "+instructor.getHisCourses()+" The Course has been deleted");
		}
	}
	@Override
	public void add(User user) {
		System.out.println("Instructor added --> ID :"+user.getId()+"\nName : "+user.getName()+"\nLast Name : "+user.getLastName());
	}
	@Override
	public void addMultiple(User users[]) {
		for(User user:users) {
			System.out.println("Instructor added -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
		}
	}
	@Override
	public void delete(User user) {
		System.out.println("Instructor Deleted -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
	}
	@Override
	public void deleteMultiple(User users[]) {
		for(User user:users ) {
		System.out.println("Instructor Deleted -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
		}
	}
		
	}


