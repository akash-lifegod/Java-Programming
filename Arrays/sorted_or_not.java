import java.util.Scanner;

public class sorted_or_not {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                c=1;
            }
        }
        if(c==0)
            System.out.println("Sorted");
        else 
            System.out.println("Unsorted");
        sc.close();
    }
}