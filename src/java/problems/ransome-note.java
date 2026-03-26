class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.isEmpty() || magazine.isEmpty()) return false;

        char[] noteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();

        Arrays.sort(noteArray);
        Arrays.sort(magazineArray);



        for (int i = 0; i < ransomNote.length(); i++) {

            if(noteArray[i] != magazineArray[i]){
                return false;
            }
        }

        return true;
    }
}