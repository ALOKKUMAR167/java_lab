import java.util.*;

public class Exception_handling{
	public static void main(String args []){
		try{
			int data;
			data = 20/0;
			System.out.println(data);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}
/*
public class Exception_handling{
	public static void main(String args []){
		try{
			int a[] = {3,5,7,8,9,2};
			System.out.println(a[10]);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
*/