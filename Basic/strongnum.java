import java.util.Scanner;
public class strongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            int f=1;
            while(r>0){
                f=f*r;
                r--;
            }
            sum=sum+f;
            n=n/10;
        }
        if(sum==k)
        System.out.println("Strong Number");
        else
        System.out.println("Not Strong Number");
        sc.close();
    }
}