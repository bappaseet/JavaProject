// Difference between Static block and init block
public class LoadingBlocks {

static{
System.out.println("Inside static");
}

{
System.out.println("Inside init");
}
public static void main(String args[]){
new LoadingBlocks();
new LoadingBlocks();
new LoadingBlocks();
}
}
/*
Output:

Inside static
Inside init
Inside init
Inside init

  */
