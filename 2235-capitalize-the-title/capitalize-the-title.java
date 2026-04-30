class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] words = title.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (word.length() <= 2) {
                sb.append(word);
            } else {
                String newWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                sb.append(newWord);
            }

            if (i != words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
 
    }
}