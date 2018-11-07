import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        String str=scn.next();
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
