// Printing combination of stars p4 and p5
public class p6 {
    public static void main(String args []){
        for(int i=1;i<=5;i++){  // This outter loop is for  number of rows
            for(int j=1;j<=i;j++){ //This inner loop is for number of columns
                System.out.print("*");
            }
            System.out.println();
        }
        //Reverse pattern of above star
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
