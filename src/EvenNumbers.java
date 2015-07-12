//Print Even Numbers < 50 with count

public class EvenNumbers {
	
	public static int count = 0;
	public int even(){
		int num=0;
		
		while(num < 50)
		  {
			count++;
			System.out.println(num);
			num = num+2 ;
		
			
		}
		return num;
	}
	
   public static void main(String args[]){
	   EvenNumbers e = new EvenNumbers();
	   e.even();
	   System.out.println(" total count " +count);
   }
}