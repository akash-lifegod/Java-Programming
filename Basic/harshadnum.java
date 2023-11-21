import java.util.Scanner;
public class harshadnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=n,sum=0;
        while(n>0){
            int r= n%10;
            sum=sum+r;
            n=n/10;
        }
        if(k%sum==0)
        System.out.println("Harshad Number");
        else
        System.out.println("Not Harshad Number");
        sc.close();
    }
}