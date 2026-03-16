public class Solution {
    public static int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();



        if(nums == null) return 0;

        for(int n = 0 ; n < nums.length; n++){
            if(nums[n] != val){
                list.add(nums[n]);
            }
        }

        for(int i = 0 ; i < list.size(); i++){
            nums[i] = list.get(i);
        }

        return list.size();
    }
}