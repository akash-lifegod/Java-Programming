import java.util.Scanner;
public class sum_digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int s=0;
        while(num>0)
        {
            int r=num%10;
            s+=r;
            num/=10;
        }
        System.out.println(s);
        sc.close();
    }
}
