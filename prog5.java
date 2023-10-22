import java.util.*;

class prog5{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		int num2 = num;
		
		int count = 0;
		while(num != 0){
		
			count++;
			num = num / 10;

		}

		int arr[] = new int[count];

		int i = 0;
		while(num2 != 0){
		
			int temp = num2 % 10;
			num2 = num2 / 10;
			int temp2 = num2 % 10;
			

			arr[i] = temp + temp2;
			i++;
		}

		for(int x : arr){
			System.out.print(x + " ,");
		}

	}
}
