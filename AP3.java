import java.util.*;
public class AP3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in celsius:");
		int Celsius = sc.nextInt();
		int Fahrenheit = (Celsius * 9/5) + 32;
		System.out.println("Temperature: "+Fahrenheit+" Fahrenheit");
		
	}
}