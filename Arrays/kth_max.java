import java.util.Scanner;
public class kth_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Input Array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter value of K : ");
        int k=sc.nextInt();
        int kmax=0;
        int pos=0;
        for(int j=0;j<k;j++)
        {
            kmax=0;
            arr[pos]=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>kmax)
                {
                    kmax=arr[i];
                    pos=i;
                }
            }
        }
        System.out.println(kmax);
        sc.close();
    } 
}
// Thats how you make comments in Java