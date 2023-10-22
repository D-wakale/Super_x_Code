import java.util.*;

class prog1{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		while(num != 0){
		
			int rem = num % 10;
			num = num / 10;

			if(rem % 2 == 0){
				
				int fact = 1;
				for(int i = rem ; i > 0; i--){
					fact = fact*i;
				}
				System.out.println(fact + " ");
			}

		}

	}
}
