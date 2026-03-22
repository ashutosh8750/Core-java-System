 import java.util.*; 
 
class demo{
	static int addition(int a , int b){
		int c ; 
			c = a+b ;
		return c ;
	}
}

class test{
	public static void main(String args[]){
				Scanner obj = new Scanner(System.in); 
				System.out.println(" Enter a value"); 
				int a= obj.nextInt(); 
				System.out.println(" Enter b value"); 
				int b = obj.nextInt(); 
				System.out.println(demo.addition(1,2)); 
	}
}