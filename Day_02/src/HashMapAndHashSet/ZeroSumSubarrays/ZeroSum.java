package HashMapAndHashSet.ZeroSumSubarrays;
import java.util.*;

public class ZeroSum {
    public  List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sumMap.containsKey(sum)) {
                for (int startIndex : sumMap.get(sum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }
}
