//1,1,2,3,5,8; 

class FibonacciSeries{
	
	
	public  void Fib(){
		int i=0;
		 int sump=0;
		int sumc=1;
		int sum=1;
		while(sum<50){
			System.out.println(sum);
			sum=sump+sumc;
		    
		    sump=sumc;
		    sumc=sum;
		
		}
	}
	//class PrimeNumber{
		
		
		/*public  void Prime(){
			int i=0;
			 int sump=0;
			int sumc=1;
			int sum=1;
			while(sum<50){
				System.out.println(" aaa"+sum);
				sum=sump+sumc;
			    
			    sump=sumc;
			    sumc=sum;
			
			}
		}*/
	public static void main(String args[]){
		FibonacciSeries fib = new FibonacciSeries();
		fib.Fib();
	}
	
}