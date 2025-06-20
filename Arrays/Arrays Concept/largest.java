public class largest {
    public int largestElement(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(largest<nums[i]){
                largest = nums[i];
            }

            if(smallest>nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }

    public static void main(String args[]){
        int nums[] = {5,6,8,3,0,1,9};
        int large = largestElement(nums);
        System.out.println(large);
    }
}

