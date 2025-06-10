import java.util.*;
public class SP5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in kilometers:");
		int Kilometers = sc.nextInt();
		double Miles = Kilometers*0.621371;
		System.out.println("Miles: "+ Miles);
		
	}
}