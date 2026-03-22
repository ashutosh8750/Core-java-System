import java.util.*; 

class Demo{
	static void swap(int a, int b){
		
	System.out.println(" before swaping " + "a " + a + "b " +b );
		int t = a; 
		a = b; 
		b = t; 
	System.out.println("after swaping" +" a"+ a + "b" + b); 
	}
}

class test{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in); 
		System.out.println(" enter a value") ; 
		int a = obj.nextInt(); 
		System.out.println(" enter b value"); 
		int b = obj.nextInt(); 
		Demo.swap(a,b); 
		}
	}
