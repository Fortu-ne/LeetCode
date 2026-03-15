class Solution {

    public boolean isAnagram(String s, String t) {

        // validate the strings
        if(s.isEmpty() || t.isEmpty()) return false;

        //converted the string to a char array
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        // sorted both arrays
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        // Compared the values if they are true/false
        return Arrays.equals(sChar,tChar);
    }
}
