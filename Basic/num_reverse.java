import java.util.Scanner;
public class num_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        int s=0;
        int r=0;
        while(num>0)
        {
            r=num%10;
            s=s*10+r;
            num/=10;
        }
        System.out.println("Reversed number is : "+s);
        sc.close();
    }
}
