package Practice;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int count=0;
        int odd= 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            odd=0;
            for(int j=i;j<n;j++)
            {

                if(nums[j]%2==1)
                {
                    odd++;
                }
                if(odd==k) count++;
            }
        }

       return count;

    }
}
