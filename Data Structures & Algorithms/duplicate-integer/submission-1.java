
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap< Integer, Boolean> containsDuplicate = new HashMap<>();
        
        for(int i =0; i<nums.length;i++){
            if(!containsDuplicate.containsKey(nums[i])){
                containsDuplicate.put(nums[i], true) ;
            }
           else if(containsDuplicate.get(nums[i])== true){
                return true;
            }
            
        }
        return false;

    }
}