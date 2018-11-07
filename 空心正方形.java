import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i=0;
        while(i<n){
            if(i==0 ||i==n-1){
                int j=0;
                while(j<n){
                    System.out.print("*");
                    j++;
                }
                System.out.println();
            }else{
                System.out.print("*");
                int k=0;
                while (k<n-2){
                    System.out.print(" ");
                    k++;
                }
                System.out.println("*");
            }
            i++;
        }
    }
}
