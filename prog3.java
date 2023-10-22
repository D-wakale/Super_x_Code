import java.util.*;

class prog3{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();


		for(int i = 0 ; i < rows ; i++){
			
			int ch1 = 64 + rows + i;
			char ch = (char)ch1;

			int chh = 64 + rows + i + 32;
			char ch2 = (char)chh;

			for(int j = 0; j < rows ; j++){
				
				if(i % 2 == 0){
					System.out.print(ch-- + " ");
				}else{
					
					System.out.print(ch2 + " ");
					ch2++;
				}
			}
			System.out.println("");
		}
	}
}
