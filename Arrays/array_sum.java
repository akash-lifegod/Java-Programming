import java.util.Scanner;
public class array_sum {
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size of Array :");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Input Array :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
