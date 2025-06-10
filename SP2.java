import java.util.*;
public class SP2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length = sc.nextInt();
		System.out.println("Enter the width: ");
		int width = sc.nextInt();
		System.out.println("Perimeter is : "+ 2*(length+width) );
	}
}