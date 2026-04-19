public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
         int start=0, end=numbers.Length-1;
        int[] result = new int[2];
        while(start<end){
            if(numbers[start]+ numbers[end]> target)
                end--;
            else if(numbers[start]+ numbers[end]< target)
                start++;
            else break;

            }
            result[0]=start+1;
            result[1]=end+1;
            return result;
    }
}
