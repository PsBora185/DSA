package Array.easy;

public class LongestCommonPrefix {

    public static String findPrefix(String[] strs) {
        if (strs.length == 0) return "";

        StringBuilder pfx = new StringBuilder(strs[0]);
        for (String s : strs) {
            if (pfx.isEmpty()) return "";

            while (!s.startsWith(pfx.toString())) {
                pfx.deleteCharAt(pfx.length() - 1);
            }
        }
        return pfx.toString();
    }

    public static void main(String[] args) {

        String[] strs = {"dog","cat"};

        System.out.println(findPrefix(strs));
    }
}
