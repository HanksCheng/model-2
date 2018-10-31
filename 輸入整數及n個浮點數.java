import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        float maxval=Float.MIN_VALUE;
        float minval=Float.MAX_VALUE;
        for (int i=0;i<n;i++){
            float v1=scn.nextFloat();
            maxval=Math.max(maxval,v1);
            minval=Math.min(minval,v1);
        }
        System.out.println("Min:"+maxval);
        System.out.println("Max:"+minval);
        }
    }
