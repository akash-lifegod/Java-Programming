//Replace all zeroes to five in a given number

import java.util.Scanner;
public class replace_0_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n+"";
        System.out.println(s.replaceAll("0", "5"));
        sc.close();
        }
    }