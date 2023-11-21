import java.util.Scanner;
public class automorphicnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq=n*n;
        int count=0;
        int c=0;
        int k=n;
        while(k>0){
            k=k/10;
            c++;
        }
        while(n>0){
            int r=n%10;
            int p=sq%10;
            if(r!=p){
                System.out.println("Not Automorphic");
                break;
            }
            else
            count++;
            n=n/10;
            sq=sq/10;
        }
        if(count==c){
            System.out.println("Automorphic Number");
        }
        sc.close();
    }
}


// 5sq=25
// 25sq=625
// 76sq=5776 square ends with the number