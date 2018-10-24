import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String v1 = scn.next();
        switch (v1){
            case "Spring":
                System.out.println("2~4");
                break;
            case "Summer":
                System.out.println("5~7");
                break;
            case "Fall":
                System.out.println("8~10");
                break;
            case "Winter":
                System.out.println("11~1");
                break;
        }
    }
}
