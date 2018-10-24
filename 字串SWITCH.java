import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a=scn.next();
        switch (a){
            case "one":
                System.out.println("1");
                break;
            case "two":
                System.out.println("2");
                break;
            case "three":
                System.out.println("3");
                break;
            case"four":
                System.out.println("4");
                break;
            case "five":
                System.out.println("5");
                break;
        }
    }
}