/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
   public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);  
    int s= sc.nextInt();
	int n = sc.nextInt();
	System.out.print("Odd Numbers from "+s+"to "+n+" are: ");
	for (int i = s; i <= n; i++) {
	   if (i % 2 != 0) {
		System.out.print(i + " ");
	   }
	}
   }
}