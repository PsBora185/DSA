package Array.medium;

import java.util.*;

public class GroupAnagram {

    public static List<List<String>> group(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            int[] arr = new int[26];
            for (char c : str.toCharArray()) {
                arr[c - 'a'] += 1;
            }
            String key = Arrays.toString(arr);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(str);
        }
        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(group(arr));
    }
}
