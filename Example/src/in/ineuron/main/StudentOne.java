package in.ineuron.main;

class Student
{
	private int age;
	private String city;
	private String Name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}

public class StudentOne {

	public static void main(String[] args) {
		Student st=new Student();
		st.getAge();
		st.getCity();
		st.getName();
		st.setAge(25);
		st.setName("Akhil");
	    st.setCity("Hyderabad");
	    System.out.println(st.getAge());
	    System.out.println(st.getName());
	    System.out.println(st.getCity());
	    StringBuffer sb=new StringBuffer("Vira");
	    sb=sb.append("tkholiRcb");
	    System.out.println(sb);
	}

}
