import java.util.Scanner;
public class array_reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0,j=n-1;i<n && j>=0;i++,j--)
        {
            temp[j]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
