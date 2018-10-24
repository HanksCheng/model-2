import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int result=0;
        for (int i=a;i<=b;i++){
            result=result+i;
        }
        System.out.println(result);
    }
}