class prog6{

	public static void main(String[] args){
	
	
		int num = 456789124;

		int leftmax = Integer.MIN_VALUE;

		while(num != 0){
		
			int rem = num % 10;
			if(rem >= leftmax){
				leftmax = rem;
			}
			num = num / 10;
		}
		System.out.println("Left max number is : " + leftmax);
	}
}
