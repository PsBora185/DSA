package Array.easy;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean check(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        // add char from string 1 and its occurrence , then for string 2 decrement the value of occurrence
        HashMap<Character, Integer> track = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = track.getOrDefault(c, 0);
            track.put(c, count + 1);
        }

        for (char c : t.toCharArray()) {
            int count = track.getOrDefault(c, 0);
            if (count == 0) return false; // if 0 then it will go in - , means t has extra of that char
            track.put(c, count - 1);
        }

        for (int count : track.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("abc", "bca"));
    }
}
