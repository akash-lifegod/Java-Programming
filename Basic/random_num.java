import java.util.Random;
import java.lang.Math;
public class random_num {
    public static void main(String[] args)
    {
        System.out.println(Math.random());
        Random r = new Random();
        
        int x = r.nextInt(1,50);    //Excluding 50 from 1
        System.out.println(x);
    }
    
}
