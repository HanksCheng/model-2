import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int result=0;
        for (int i=1;i<=a;i++){
            result=result+i;
            System.out.println(i+"\t"+i*i);
        }
    }
}