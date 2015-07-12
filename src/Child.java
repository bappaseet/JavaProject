import java.io.IOException;

class Parent{
	
	public void method() throws Exception {
		System.out.println("I am Inside Parent");
		throw new Exception("failure in parent");
	}
}
public class Child extends Parent {
	
	public void method() throws IOException {
		 
		System.out.println("I am inside Child");
		throw new IOException("failure in child");
	}
   
	public static void main(String args[]) {
		Parent p = new Child();
		
			try {
				p.method();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("handled");
			}
		
		
		
		
	}
}