import java.util.Scanner;

public class addition_program_staticmethod {

	static String sum = "Sum of A and B = " ;

	public static void main(String[] args) {

		float A,B;

		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in); 


		System.out.print("Enter A value = ");
		A = sc.nextInt();


		System.out.print("Enter B value = ");
	    B = sc.nextInt(); 

	    float C = A + B;


	    System.out.println(sum+ C);




	}

}