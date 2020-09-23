package synchronizators.leetcode.learn;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    private int[] map;
    public MyHashMap() {
        map = new int[100001];
        Arrays.fill(map, -1);
    }
    public void put(int key, int value) {
        map[key] = value;
    }
    public int get(int key) {
        return map[key];
    }
    public void remove(int key) {
        map[key] = -1;
    }
}
