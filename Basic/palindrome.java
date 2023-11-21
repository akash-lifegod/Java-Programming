import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        int k=num;
        int s=0;
        int r=0;
        while(num>0)
        {
            r=num%10;
            s=s*10+r;
            num/=10;
        }
        if(s==k)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
        sc.close();
    }
}
