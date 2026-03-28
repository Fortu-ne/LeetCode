class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        if(nums == null) return new int[]{};

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        System.arraycopy(nums,0,ans,nums.length,nums.length);

        return ans;


    }
}