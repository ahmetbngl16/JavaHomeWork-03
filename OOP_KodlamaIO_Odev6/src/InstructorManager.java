
public class InstructorManager extends UserManager{
	
	//Kurs ad�n� eklemek i�in ilk parametrede e�itmen nesnesi ikinci parametrede kursun ad� girilmedir.
	
	public String addCourseName(Instructor �nstructor,String courseName) {
		�nstructor.setHisCourses(courseName);
		return �nstructor.getHisCourses();
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


