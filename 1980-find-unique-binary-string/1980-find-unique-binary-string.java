class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        for (String s : nums) {
            set.add(s);
        }

        int len = nums[0].length();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < len; i++) {
            sb.append("0");
            for (int j = i + 1; j < len; j++) {
                sb.append("1");
            }
            String ans = sb.toString();
            if (!set.contains(ans)) {
                return ans;
            }
            sb.setLength(i + 1);
        }

        sb.setLength(0);

        for (int i = 0; i < len; i++) {
            sb.append("1");
            for (int j = i + 1; j < len; j++) {
                sb.append("0");
            }
            String ans = sb.toString();
            if (!set.contains(ans)) {
                return ans;
            }
            sb.setLength(i + 1);
        }
        return "";
    }
}