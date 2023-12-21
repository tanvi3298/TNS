import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter non zero value: ");
		int num = reader.nextInt();
		if(num % 2 == 0)
			System.out.println(num + " is an even number");
		else
			System.out.println(num + " is an odd number");
		

	}

}
