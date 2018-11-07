import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = 1;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        for (int k = 0; k < m; k++) {
            System.out.print("*");
        }
        System.out.println();
        m = m + 2;
    }
    }
}
