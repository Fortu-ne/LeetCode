class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length < 1 || k < 1) return null;

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int n : nums){
            hash.put(n,hash.getOrDefault(n,0)+ 1);
        }

        // Top-K Freq
        // used for converting a hashmap to a list
        // list sort and reverse
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());
        list.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());


        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }

        return res;
    }

    //Same problem used with PriorityQueue
    private  int[] topKFrequent(int[] nums, int k) {

        if(k < 1 || nums == null) return new int[]{};

        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i],hash.getOrDefault(nums[i],0) +1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());

        int[] newArr = new int[k];

        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int i = 0;

        while(!heap.isEmpty()){
            newArr[i] = heap.poll().getKey();
            i++;
        }

        return newArr;
    }
}