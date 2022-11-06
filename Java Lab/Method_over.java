import java.util.*;
public class Method_over{
	static int student(int x,int y){
		return x+y;
	}
	static int student (int x,int y,int z){
		return x+y+z;
	}
	
	public static void main(String [] args){
		System.out.println(student(10,20));
		System.out.println(student(10,20,30));
	}
}