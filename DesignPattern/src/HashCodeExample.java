class student{
	int id;
	String name;
	
	student(int id,String name){
		this.id =id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
public class HashCodeExample {

	public static void main(String[] args) {
		student s1 = new student(1,"shal");
		student s2 = new student(1,"shal");	
		String s3 = new String("amit");
		String s4 = new String("amit");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		/*
		 * System.out.println(s3.hashCode()); System.out.println(s4.hashCode());
		 * System.out.println(s3.equals(s4));
		 */

	}

}
