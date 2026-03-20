class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Standard Anagram (sort using charArray) problem
        //You update the existing key with itself and with the update list
        //get the current list in the hashmap and update it
        //call a hash.values() for the solution

        if(strs.length < 1) return null;

        HashMap<String,List<String>> hash = new HashMap<>();


        for(String s : strs){
            char[] strChar = s.toCharArray();
            Arrays.sort(strChar);
            String key = new String(strChar);

            if(hash.containsKey(key)){
                List<String> current = hash.get(key);
                current.add(s);
                hash.put(key,current);

            }
            else{
                List<String> init = new ArrayList<>();
                init.add(s);
                hash.put(key,init);

            }

        }


        return new ArrayList<>(hash.values());

    }
}
