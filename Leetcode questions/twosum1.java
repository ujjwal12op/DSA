import java.util.HashMap;

class Solution {
    /**
     * @param nums
     * @param target
     * @return
     */
    public int [] twoSum(int[] nums, int target){
            HashMap<Integer,Integer> map=new HashMap();
    //Fill HM

    for(int i=0;i<nums.length;i++){
        map.put(nums[i],i);
    }
    //searching
    for(int i=0;i<nums.length;i++){
        int num=nums[i]; //2 
        int rem=target - num; // 7
        if(map.containsKey(rem)){
            int index = map.get(rem);
            if(index==i)continue;
            return new int[]{i,index};
        }
    }
    return new int[]{};
    }
}
