import java.util.Scanner;
public class perfectnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n)
        System.out.println("Perfect");
        else
        System.out.println("Nah! Just an ordinary number");
        sc.close();
    }
}
