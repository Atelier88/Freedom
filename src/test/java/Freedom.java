
public class Freedom {

	//Static method - object creation is not required to call
	static void Game() {
		String name="Eren";
		int age=25;
		System.out.println(name+" "+age);
}
	//Instance method - object creation is required to call
	int Mem(int age , String name) {
		System.out.println("Returning only age");
		return age;
	
		
	}
	
	public static void main(String args[]) {
		Freedom fe=new Freedom();
		int age=fe.Mem(12, "Armin");
		String name="Armin";
		Freedom.Game();
		System.out.println(age+ "" + name);
	}

}
