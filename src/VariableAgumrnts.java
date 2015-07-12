//Using Varags

public class VariableAgumrnts {
	
	String name="arun";
	int roll=20;
	long phone_number=24353535;
	public void method(int roll,String name){
		
	}
	
	 public void method(String str,int... roll){
    	 System.out.println("Inside Mixed string and  Int");
	}
     public void method(int roll,int roll1){
    	 System.out.println("Inside single Int");
	}
    public void method(int... roll){
	 System.out.println("Inside varargs");
}

    public static void main(String [] args){
    	VariableAgumrnts p = new VariableAgumrnts();
    	p.method(1,2,3,4,5);
    	p.method(1);
    	p.method("bapu",1,3,4);
    }
}