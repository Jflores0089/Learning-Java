public class ConcatenationOfArray{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = getConcatenation(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int arr[] = new int [nums.length * 2];
        for (int i = 0; i < arr.length; i++){
            if (i < nums.length) 
                arr[i] = nums [i];
            else arr[i] = nums[i - nums.length];            
        }
         return arr;       
    }
}