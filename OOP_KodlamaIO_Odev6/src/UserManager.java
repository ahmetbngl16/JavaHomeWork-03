
public class UserManager {
	public void add(User user) {
		System.out.println("Default added -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
	}
	public void addMultiple(User users[]) {
		for(User user :users) {
			System.out.println("Default added -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
		}
	}
	public void delete(User user) {
		System.out.println("Default Deleted -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
	}
	public void deleteMultiple(User users[]) {
		for(User user:users) {
			System.out.println("Default add -->"+user.getId()+"\nName : "+user.getName()+"\n Last Name : "+user.getLastName());
		}
	}

}
