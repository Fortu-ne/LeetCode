class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length < 1) return null

        HashMap<String,List<String>> hash = new HashMap<>();

        for(String s: strs){

            char[] letter = s.toCharArray();
            Arrays.sort(letter);

            String word = Arrays.toString(letter);

            if(hash.containsKey(word)){

                List<String> ls = hash.get(word);
                ls.add(s);
                hash.put(word,ls);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                hash.put(word,list);
            }


        }

        return new ArrayList<>(hash.values());
    }
}