import java.util.*;
public class SP1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle: ");
		int Principle = sc.nextInt();
		System.out.println("Enter the Rate: ");
		int Rate = sc.nextInt();
		System.out.println("Enter the Time: ");
		int Time = sc.nextInt();
		System.out.println("Simple interest = "+ (Principle*Time*Rate)/100 );
	}
}