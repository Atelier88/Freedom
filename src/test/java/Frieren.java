
public class Frieren {
	private String name;
	private int age;
	
	public Frieren(String name,int age) {
		this.name=name;
		this.age=age;
	}
	//Getters get name
	public String getName() {
		return name;
	}
	//Setters set name
	public void setName(String name) {
		this.name=name;
	}
	//Getters get name
		public int getAge() {
			return age;
		}
		//Setters set name
		public void setAge(int age) {
			this.age=age;
		}
	public static void main(String args[]) {
		Frieren fe=new Frieren("Mashel",18);
		System.out.println(fe.name+" "+fe.age);
		
		fe.setName("Thorfin");
		fe.setAge(16);
		System.out.println(fe.getName()+" "+fe.getAge());
		
	}

}
