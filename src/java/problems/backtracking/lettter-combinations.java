class Solution {

     // favorite problem, re-check before any assessment or challange
     // Make a HashMap to the corresponding letters from a phone keypad
    // validate the parameters
    // create a void function for backtracking usuall template backtrack(0,list,res)
    // validate if the current list and call back
    // Backtracking always remember (Add,Backtrack + 1 and Undo)

    public List<String> letterCombinations(String digits) {

        if(digits.length() < 1) return new ArrayList<>();

        HashMap<Character,String> hash = new HashMap<>();
        List<String> res = new ArrayList<>();

        hash.put('2',"abc");
        hash.put('3',"def");
        hash.put('4',"ghi");
        hash.put('5',"jkl");
        hash.put('6',"mno");
        hash.put('7',"pqrs");
        hash.put('8',"tuv");
        hash.put('9',"wxyz");



        backtrack(0,digits,new StringBuilder(),hash,res);


        return res;
    }

    private void backtrack(int i, String digits, StringBuilder stringBuilder, HashMap<Character, String> hash, List<String> res) {

        if(stringBuilder.length() == digits.length()){
            res.add(stringBuilder.toString());
            return;
        }

        Character current = digits.charAt(i);
        String letters = hash.get(current);



        for (int j = 0; j < letters.length(); j++) {

            stringBuilder.append(letters.charAt(j));
            backtrack(i+1,digits,stringBuilder,hash,res);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);

        }
    }

}
