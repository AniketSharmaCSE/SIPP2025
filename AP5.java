import java.util.*;
public class AP5{
	public static void main(String[] args){
		System.out.println("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		int radius = sc.nextInt();
		System.out.println("Enter the height: ");
		int height = sc.nextInt();
		double pi = 3.14;
		System.out.println("Area for the given cylinder is : "+ pi*radius*radius*height );
	}
}