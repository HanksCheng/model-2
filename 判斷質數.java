import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int k=n/2;
	boolean flag=true;
	for (int i=2;i<=k;i++){
	    if (n%i==0){
	        flag=false;
        }
    }
    if (flag==true){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}
