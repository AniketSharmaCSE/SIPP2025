import java.util.*;
public class AP4{
	public static void main(String[] args){
		System.out.println("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		double pi = 3.14;
		System.out.println("Area for the given circle is : "+ pi*radius*radius );
	}
}