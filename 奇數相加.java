import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int result=0;
        if (a%2==0){
            a++;
        }
        for (int i=a;i<=b;i+=2){
            result=result+i;
        }
        System.out.println(result);
    }
}