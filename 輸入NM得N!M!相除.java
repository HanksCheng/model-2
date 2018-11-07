import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int a=1,b=1,c=1;
        for(int i=n;i>1;i--){
            a=a*i;
        }
        for(int i=2;i<=m;i++){
            b=b*i;
        }
        for(int i=n-m;i>1;i--){
            c=c*i;
        }
        System.out.println(a/(b*c));
    }
}
