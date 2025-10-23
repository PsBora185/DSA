package Array.easy;

import java.util.Arrays;

class MyHashMap {
    boolean[] keys;
    int[] values;

    public MyHashMap() {
        keys = new boolean[1000001];
        values = new int[1000001];
    }

    public void put(int key, int value) {
        keys[key] = true;
        values[key] = value;
    }

    public int get(int key) {
        if (keys[key]) return values[key];
        return -1;
    }

    public void remove(int key) {
        keys[key] = false;
    }
}

public class DesignHashMap {

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));
    }
}
