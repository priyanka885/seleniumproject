package autopro;

public class Singleton {
	
	private Singleton() {
		
	}
	
	private static Singleton obj_single = new Singleton();
	
	private static Singleton getInstance() {
		return Singleton.obj_single;
	}
	
			
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getInstance());

	}

}
