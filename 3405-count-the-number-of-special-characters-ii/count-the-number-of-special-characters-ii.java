class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new LinkedHashSet<>();
        String s = word;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                char lower = s.charAt(i);
                char upper = Character.toUpperCase(lower);
                if (set.contains(lower)) {
                    continue;
                }
                set.add(lower);
                boolean special = true;
                int firstUpper = -1;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == upper) {
                        firstUpper = j;
                        break;
                    }
                }
                if (firstUpper == -1) {
                    continue;
                }
               for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == lower && j > firstUpper) {
                        special = false;
                        break;
                    }
                }
                if (special) {
                    count++;
                }
            }
        }
        return count;
    }
}