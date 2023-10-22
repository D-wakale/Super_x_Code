class armassi{

	public static void main(String[]args){
	
		int n=153;
		int count=0;
		int sum=0;
		int n1=n;
		int n2=n;

		while(n!=0){
		
			count++;
			n=n/10;
		}
		while(n1!=0){
		
			int rem=n1%10;
			int mul=1;
			for(int i=1;i<=count;i++){
			
				mul=mul*rem;
			}
			sum=sum+mul;
			n1=n1/10;
		}
		if(sum==n2)
			System.out.println("It is an armstrong no");
		else
			System.out.println("not armstrong");
	}
}
