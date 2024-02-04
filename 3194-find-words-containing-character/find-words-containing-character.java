class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(Character.toString(x))) {
                indices.add(i);
            }
        }

        return indices;
    }
}
