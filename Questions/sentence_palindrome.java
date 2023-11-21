import java.util.Scanner;

public class sentence_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String[] ar=new String[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            ar[j]=arr[i];
            j++;
        }
        int flag =1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(ar[i])){
                flag=0;
            }
            else{
                flag=1;
            }
        }
        if(flag==0)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
        sc.close();
    }
}
