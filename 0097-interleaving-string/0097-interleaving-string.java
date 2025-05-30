import java.util.*;

class Solution {

    public boolean check(Map<String, Boolean> map, int l1, int l2, int l3, String s1, String s2, String s3,int p1, int p2, int p3) {

        if (p3 == l3) {
            return (p1 == l1 && p2 == l2);
        }

        String key = p1 + "*" + p2 + "*" + p3;

        if (map.containsKey(key)) {
            return map.get(key);
        }

        boolean flag = false;

        if (p1 < l1 && s1.charAt(p1) == s3.charAt(p3)) {
            flag = check(map, l1, l2, l3, s1, s2, s3, p1 + 1, p2, p3 + 1);
        }

        if (!flag && p2 < l2 && s2.charAt(p2) == s3.charAt(p3)) {
            flag = check(map, l1, l2, l3, s1, s2, s3, p1, p2 + 1, p3 + 1);
        }

        map.put(key, flag);
        return flag;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        Map<String, Boolean> map = new HashMap<>();
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        if (len1 + len2 != len3) return false;

        return check(map, len1, len2, len3, s1, s2, s3, 0, 0, 0);
    }
}
