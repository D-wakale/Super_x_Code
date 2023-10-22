/*i/p - >adgtiosebi
o/p -> a = 1
       e = 1
       i = 2 
       o = 1
       u = 0
 */ 

import java.io.*;

class prog8 {

	public static void main(String args[])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String");
		String str = br.readLine();

		char arr[] = str.toCharArray();
		int countofa = 0, countofe = 0, countofi = 0, countofo = 0, countofu = 0; 

		for(int i = 0;i<arr.length;i++){
			if(arr[i] == 'a' || arr[i] == 'A'){
				countofa++;
			}else if(arr[i] == 'e' || arr[i] == 'E'){
				countofe++;
			}else if(arr[i] == 'i' || arr[i] == 'I'){
				countofi++;
			}else if(arr[i] == 'o' || arr[i] == 'O'){
				countofo++;
			}else if(arr[i] == 'u' || arr[i] == 'U'){
				countofu++;
			}
		}
		System.out.println(" a = " + countofa + "\n" + " e = " + countofe + "\n" + " i = " +countofi + "\n" + " O = " + countofo + "\n" + " u = "+ countofu);
	}
}


