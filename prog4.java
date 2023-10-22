

class prog4 {

        public static void main(String args[]){

                
                int row=4;

                char ch = 'A';
                for(int i = 1;i<=row;i++){

                        for(int j = 1;j <=row-i+1;j++){

                                if(i % 2 == 1){

                                        if((i+j) % 2 == 0){
                                                System.out.print(ch + " ");
                                        }else{
                                                System.out.print((char)(ch+32)+" ");
                                        }
                                        ch++;
                                }else{
                                        ch--;
                                        if((i+j) % 2 == 0){
                                                System.out.print(ch + " ");
                                        }else{
                                                System.out.print((char)(ch+32)+ " ");
                                        }
                                }
                        }
                        System.out.println();
                }
        }
}

