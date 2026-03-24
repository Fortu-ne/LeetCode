class Solution {
    public boolean isHappy(int n) {

        if (n == 1) return true;

        HashSet<Integer> seen = new HashSet<>();

        int total = n;
        String num = Integer.toString(n);

        while (true) {

            if (seen.contains(total)) {
                return false; // cycle detected
            }
            seen.add(total);

            int curr = 0;
            for (int i = 0; i < num.length(); i++) {
                int value = Character.getNumericValue(num.charAt(i));
                curr += value * value;
            }

            total = curr;

            if (total == 1) {
                return true;
            }

            num = Integer.toString(total);
        }
    }

}