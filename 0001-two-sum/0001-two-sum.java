class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int target2 = target - nums[i];
            if (map.containsKey(target2)) {
                arr[0] = map.get(target2);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }
        return arr;
    }
}