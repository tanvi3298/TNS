import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter non zero value: ");
		int n = reader.nextInt();
		int r;
		int sum = 0;
		int temp;
		temp = n;
	while(n > 0) {
		r = n % 10;
		sum = (sum * 10) + r;
		n = n/10;
	}
	if(temp==sum)
		System.out.println("It is a Palindrome No");
	else
		System.out.println("It is not Palindrome No");
	}
}
		