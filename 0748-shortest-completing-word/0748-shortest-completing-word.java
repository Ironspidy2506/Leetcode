class Solution {
    public String shortestCompletingWord(String lp, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : lp.toCharArray()) {
            if (Character.isLetter(c)) {
                char ch = Character.toLowerCase(c);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        int len = Integer.MAX_VALUE;
        String ans = "";

        for (String s : words) {
            Map<Character, Integer> wordMap = new HashMap<>();
            for (char c : s.toCharArray()) {
                char ch = Character.toLowerCase(c);
                System.out.print(ch + " ");
                if (map.containsKey(ch)) {
                    wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
                }
            }
            
            if (map.keySet().equals(wordMap.keySet())) {
                boolean flag = true;
                for (char chrs : wordMap.keySet()) {
                    if (wordMap.get(chrs) < map.get(chrs)) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    if (len > s.length()) {
                        len = s.length();
                        ans = s;
                    }
                }
            }

        }
        return ans;
    }
}