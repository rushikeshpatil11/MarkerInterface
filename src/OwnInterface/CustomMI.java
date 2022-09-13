package OwnInterface;

public class CustomMI {
	
	public static void main(String[] args) {
		
		Test t1=new Test();
		String s1=new String();
		Shape s2=new Shape();
		System.out.println(Shape.delete(t1));
		System.out.println(Shape.delete(s1));
		System.out.println(Shape.delete(s2));
	
	}

}
 interface Deletable{
	
}
 class Test implements Deletable{
	 
	 //implemention details
 }
 class Shape{
	 
	 // other methods
	 public static boolean delete(Object obj) {
		 
		 if(obj instanceof Deletable) {
			 // logic for delete
			return true;
		 }
		 else
			 return false;
		 
	 }
 }