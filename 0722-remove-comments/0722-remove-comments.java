class Solution {
    public List<String> removeComments(String[] source) {
        List<String> list = new ArrayList<>();
        boolean flag = false;  // Tracks if we're inside a block comment
        StringBuffer sb = new StringBuffer();

        for (String s : source) {
            char ch[] = s.toCharArray();
            int i = 0;

            if (!flag) sb.setLength(0); // Reset buffer for a new line

            while (i < ch.length) {
                // Detect start of block comment (/*)
                if (!flag && i + 1 < ch.length && ch[i] == '/' && ch[i + 1] == '*') {
                    flag = true;
                    i += 1; // Move past `/*`
                }
                // Detect end of block comment (*/)
                else if (flag && i + 1 < ch.length && ch[i] == '*' && ch[i + 1] == '/') {
                    flag = false;
                    i += 1; // Move past `*/`
                }
                // Detect single-line comment (//)
                else if (!flag && i + 1 < ch.length && ch[i] == '/' && ch[i + 1] == '/') {
                    break; // Ignore rest of the line
                }
                // Append valid characters (if not in block comment)
                else if (!flag) {
                    sb.append(ch[i]);
                }
                i++;
            }

            // Add non-empty lines to the result
            if (!flag && sb.length() > 0) {
                list.add(sb.toString());
            }
        }
        return list;
    }
} 