import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2) {
            return new int[]{};
        }
        Map<Integer, Integer> dp = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            dp.put(nums[i],i);
            int complement = target - nums[i];
            Integer index = dp.get(complement);
            if(index != null && index != i) {
                return new int[]{i, index};
            }
        }

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer index = dp.get(complement);
            if(index != null && index != i) {
                return new int[]{i, index};
            }
        }
        return new int[]{};
    }
}
