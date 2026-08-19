class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            char ch = chars[i];

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            if (count == 1) {
                chars[index++] = ch;
            } else {
                chars[index++] = ch;
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[index++] = digit;
                }
            }
            i--;
        }
        return index;
    }
}