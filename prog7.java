
import java.io.*;
class prog7 {

	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the array Size");
		int size = Integer.parseInt(br.readLine());


		int arr1[] = new int[size];
		int arr2[] = new int[size];

		System.out.println("Enter the Array Elements");
		for(int i = 0;i<size;i++){
			arr1[i] = Integer.parseInt(br.readLine());
		}

		for(int i = 0 ; i <arr1.length ;i++){
		
			if(arr1[i] % 2 == 0){

				arr2[i] = 1;

			}
		}
		
		System.out.println("Array1");
		
		for(int x : arr1){
			System.out.print(x + ", ");
		}
		System.out.println();
		System.out.println("Array2");
		
		for(int y : arr2){
			System.out.print(y + ", ");
		}
	}
}

