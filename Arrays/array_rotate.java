import java.util.Scanner;

public class array_rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k =n;
        System.out.println("How many times to rotate : ");
        int r= sc.nextInt();
        int t = n*2 - 1;
        for(int i =0;i<r;i++){
            for(int j =0;j<k;j++){
                int temp = arr[n-1];
                if(t-k>0){
                    arr[t-k]=arr[t-k-1];
                    t--;
                }
                else if(t-k-1==-1){
                    arr[1]=arr[0];
                    arr[0]=temp;
                }
                   
            }
            
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(arr[i]);
        }
        
        sc.close();
    }
}
