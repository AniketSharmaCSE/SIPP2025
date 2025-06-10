import java.util.*;
public class SP3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base ");
		int base = sc.nextInt();
		System.out.println("Enter the exponent ");
		int exponent = sc.nextInt();
		System.out.println("Power calculation : "+ Math.pow(base, exponent));
	}
}