import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        if (a.equals("one")) {
            System.out.println("1");
        } else if (a.equals("two")) {
            System.out.println("2");
        } else if (a.equals("three")) {
            System.out.println("3");
        } else if (a.equals("four")) {
            System.out.println("4");
        } else if (a.equals("five")) {
            System.out.println("5");
        }
    }
}