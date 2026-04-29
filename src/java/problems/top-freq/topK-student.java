class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {


        if (report.length < 1 || student_id.length < 1 || k > student_id.length) return new ArrayList<>();

        HashMap<Integer,Integer> hash = new HashMap<>();
        HashSet<String> hash_postive = new HashSet<>();
        HashSet<String> hash_negative = new HashSet<>();

        for (String s : positive_feedback){
            hash_postive.add(s);
        }

        for (String s : negative_feedback){
            hash_negative.add(s);
        }


        for (int i = 0; i < student_id.length; i++) {
            String cur_report = report[i];

            int total = 0;
            // if report 1 has value +3 or -1

            String[] cur = cur_report.split(" ");

            for (String word : cur){
                if(hash_postive.contains(word)) {
                    total+=3;
                }

                if(hash_negative.contains(word)){
                    total-= 1;
                }

            }



            hash.put(student_id[i],total);

        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());

        list.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed().thenComparing(Map.Entry<Integer,Integer>::getKey));

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            res.add(list.get(i).getKey());
        }

        return res;

    }
}