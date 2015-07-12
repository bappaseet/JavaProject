public class StringReverse{
	
	
	String reverse="";
	
	public String Reverse(String str){
		
		if(str.length()==1){
			return str;
		} else{
		reverse+=str.charAt(str.length()-1)+Reverse(str.substring(0,str.length()-1));
	    return reverse;
		}}
	
	public static void main(String args[]){
		String str1 = "Today is Sunday";
		StringReverse rev = new StringReverse();
	    System.out.println(" " +rev.Reverse(str1));
	}
	
	public void readInput(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int t=0;t<n;t++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}