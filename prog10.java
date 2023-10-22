import java.io.*;

class prog10{

        public static void main(String args[])throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the String");
              
	      	String str = br.readLine();

                char arr[] = str.toCharArray();

		int start = 0;
		int end = arr.length-1;
		int count = 0;
	
		while(start < end){
			
			if(arr[start] == arr[end]){
				start++;
				end--;
			}else{
				count++;
				break;
			}
		}
	}
}	
