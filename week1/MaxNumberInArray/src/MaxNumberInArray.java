public class MaxNumberInArray {

    public static int MaxValue(int arr []){
    
        int maxValue = arr[0];
    
        for (int i = 0; i < arr.length; i++){
            if (maxValue < arr [i]){
                maxValue = arr [i];
            }
        }    
        return maxValue;
    }
        
    public static void main(String[]args){
        int arr [] = new int []{16,22,64,48,69};
        
        System.out.println(MaxValue(arr));
    }
}    
