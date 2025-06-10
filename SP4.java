import java.util.*;
public class SP4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Enter the third number: ");
		int c = sc.nextInt();
		double average =  (a+b+c)/3;
		System.out.printf("Average = %.2f", average );
	}
}