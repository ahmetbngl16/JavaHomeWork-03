import java.util.*;
public class Main {

	public static void main(String[] args) {
		/*Kodlama.io projesini yazdýðýnýzý düþünelim.
         *User, Instructor, Student nesnelerini modelleyiniz. (Class-Inheritance)
         *UserManager, InstructorManager, StudentManager için sistemde olabilecek 
         *operasyonlarý tahminleyip modelleyiniz. (Class-Inheritance-Method)
*/       
		 int switch1,id;
		 String name,lastName,courseName,takeCourse;
		 Instructor instructor=new Instructor();
		 Student student=new Student();
		 InstructorManager instructorManager=new InstructorManager();
		 StudentManager studentManager=new StudentManager();
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.print("***--->Kullanýcý Ýþlemleri<---***"+
                            "\n1)Öðrenci kayýt  "+
		                    "\n2)Öðretmen Kayýt "+
                            "\nSeçiminiz : ");
		 
		 switch1=scan.nextInt();
		 switch (switch1) {
		 case 1: {
			System.out.print("Ýd numarasý giriniz : ");
			id=scan.nextInt();
			instructor.setId(id);
			System.out.print("Ýsim Giriniz : ");
			name=scan.next();
			instructor.setName(name);
			System.out.print("Soy isim giriniz : ");
			lastName=scan.next();
			instructor.setLastName(lastName);
			System.out.print("Kursunun adýný giriniz : ");
			courseName=scan.next();
			instructor.setHisCourses(courseName);
			System.out.print("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
			System.out.println(" ");
			instructorManager.add(instructor);
			break;
		
		}
		 case 2:{
			    System.out.print("Ýd numarasý giriniz : ");
				id=scan.nextInt();
				student.setId(id);
				System.out.print("Ýsim Giriniz : ");
				name=scan.next();
				student.setName(name);
				System.out.print("Soy isim giriniz : ");
				lastName=scan.next();
				student.setLastName(lastName);
				System.out.print("Aldýðý kursun adýný giriniz : ");
				takeCourse=scan.next();
				student.setTakeCourses(takeCourse);
				System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				studentManager.add(student);
				break;
			 
		 }
		 default:
			 break;
			
		}
		 
		 
		 
		 scan.close();
		 
		 
	}

}
