package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 用set效率更高
 */
public class Test349 {
    public static void main(String[] args) {
        int[] array1 = new int[]{3, 6, 6, 8, 10, 3, 9};
        int[] array2 = new int[]{8, 9, 3, 20, 10, 66};

        int[] res = intersection(array1, array2);
        System.out.println();
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> integerList = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> integerList2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        integerList = integerList.stream().sorted().distinct().collect(Collectors.toList());
        integerList2 = integerList2.stream().sorted().distinct().collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        for (int num1 : integerList) {
            for (int num2 : integerList2) {
                if (num1 == num2) {
                    resultList.add(num1);
                    break;
                }
            }
        }

        int[] result = new int[resultList.size()];
        int i = 0;
        for (int a : resultList) {
            result[i] = a;
            i++;
        }
        return result;
    }
}
