import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0, b = 0, c = 0;
        int fCount = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            a = scn.nextInt();
            b = scn.nextInt();
            c = scn.nextInt();
            fCount = 0;
            sum = 0;
            if (a < 60) {
                fCount++;
            }
            if (b < 60) {
                fCount++;
            }
            if (c < 60) {
                fCount++;
            }
            sum = a + b + c;
            if (fCount == 0) {
                System.out.println("p");
            } else if (fCount >= 1) {
                if (sum >= 220) {
                    System.out.println("p");
                } else {
                    System.out.println("M");
                }
            } else if (fCount == 2) {
                if (Math.max(Math.max(a, b), c) >= 80) {
                } else {
                    System.out.println("F");
                }
            } else {
                System.out.println("F");
            }
        }
    }
}