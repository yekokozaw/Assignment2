package app;
import java.util.Scanner;
public class Hms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		SecondToHms obj=new SecondToHms();
		
		System.out.println("Enter second:");
		int second=in.nextInt();
		obj.Converter(second);
	}
}
