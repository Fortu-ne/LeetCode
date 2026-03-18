class Solution {
    public int majorityElement(int[] nums) {

        if(nums.length < 1) return 0;

        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i],hash.getOrDefault(nums[i],0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());

        list.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());

        return list.get(0).getKey();
    }
}