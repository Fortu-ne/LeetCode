class Solution {

    //Similar problem to topK Freq elements
    public List<String> topKFrequent(String[] words, int k) {

        if(words.length < 1 || k < 1) return null;

        HashMap<String,Integer> hash = new HashMap<>();

        for(String word : words){
            hash.put(word,hash.getOrDefault(word,0)+ 1);
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(hash.entrySet());

        list.sort(Comparator.comparing(Map.Entry<String,Integer>::getValue).reversed().thenComparing(Map.Entry<String,Integer>::getKey));
        List<String> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            res.add(list.get(i).getKey());
        }

        return res;
    }
}