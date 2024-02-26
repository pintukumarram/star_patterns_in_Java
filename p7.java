public class p7 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){  // this loop is for printing space
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){ // this loop is for printing star
                System.out.print("*"); 
            }
            System.out.println();
        }

        
    }
}
