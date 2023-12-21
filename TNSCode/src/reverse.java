import java.util.Scanner;
import java.io.*;

public class reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Flower", nstr=" ";
		char ch;
		System.out.print("Original String: " + str);
		for ( int i = 0; i < str.length(); i++)
		{
			ch = str.charAt(i);
			nstr = ch+nstr;
		}
		System.out.println(" \nReversed String: " + nstr);
		
	}

}
