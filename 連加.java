import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=0;
        int sum=0,count=0;
        while (n!=-999){
            sum=sum+n;
            n=scn.nextInt();
            count=count+1;
        }
        System.out.println(sum);
        System.out.println(sum/(count-1));
    }
}
