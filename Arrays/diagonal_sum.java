import java.util.Scanner;
public class diagonal_sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter rows :");
        int r = sc.nextInt();
        System.out.print("Enter coloumn :");
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.print("Input Array :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum =0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
