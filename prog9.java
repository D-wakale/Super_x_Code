import java.io.*;
class prog9{

	public static void main(String args[])throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the String");
                String str = br.readLine();

                char arr[] = str.toCharArray();

		for(int i = 0 ; i < arr.length ; i++){

			if( i % 2 == 0){
				
				if(arr[i] >= 'A' && arr[i] <= 'Z'){
					System.out.print(arr[i]);
				}else{
					System.out.print((char)(arr[i]-32));
				}
			}else{
			
				if(arr[i] >= 'a' && arr[i] <= 'z'){
					System.out.print(arr[i]);
				}else{
					System.out.print((char)(arr[i] + 32));
				}
			}
		}
		System.out.println();
	}


}
