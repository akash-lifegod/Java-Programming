// Implement a program that prompts the user to enter three words and then prints them in reverse order.

import java.util.Scanner;

public class reverse_sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
