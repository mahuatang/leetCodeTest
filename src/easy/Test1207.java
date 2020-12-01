package easy;

import java.util.*;
import java.util.stream.Collectors;

public class Test1207 {
    public static void main(String[] args) {
      //  int[] arr = new int[]{2, 3, 6, 2, 8, 10, 22, 32, 10};
        int[] arr = new int[]{1,2,2,1,1,3};
        uniqueOccurrences(arr);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                map.put(arr[i], sum);
                break;
            }
            if (arr[i] != arr[i + 1]) {
                map.put(arr[i], sum);
                sum = 1;
                continue;
            }
            sum++;
        }
        Set<Integer> set = map.keySet();
        List<Integer> list = new LinkedList<>();
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
            list.add(map.get(iterator.next()));
        }
        int length = list.size();
        list = list.stream().distinct().collect(Collectors.toList());
        int length2 = list.size();
        if (length > length2) {
            return false;
        }

        return true;
    }
}
