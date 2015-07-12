public class ReverseCompare{
	
	
	String reverse="";
	
	public String Reverse(String str){
		
		if(str.length()==1){
			return str;
		} else{
		reverse+=str.charAt(str.length()-1)+Reverse(str.substring(0,str.length()-1));
	    return reverse;
		}}
	
	public static void main(String args[]){
		//String str1 = "Today is Sunday";
		String str1 = "aabbaa";
		ReverseCompare rev = new ReverseCompare();
        String str2=rev.Reverse(str1);
        
        if(str1.equals(str2))
        	 System.out.println("Strings are equal");
        	else 
        		System.out.println("Strings are not equal");
        
        
	}
}