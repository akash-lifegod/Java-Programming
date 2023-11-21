public class sum_odd {
    public static void main(String[] args) {
        int arr[]={1,2,33,4,6,7,8,9};
        int sum=0;
        for(int i=0;i<8;i++)
        {
            if(arr[i]%2!=0)
            {
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }

}