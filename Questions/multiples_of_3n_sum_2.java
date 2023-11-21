// Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

import java.util.Scanner;
public class multiples_of_3n_sum_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int c=1;
        int i=1;
        while(c<=n1){
            int out=3*i+2;
            if(out%n2!=0){
                System.out.println(out);
                c++;
            }
            i++;
        }
        sc.close();
    }
}

