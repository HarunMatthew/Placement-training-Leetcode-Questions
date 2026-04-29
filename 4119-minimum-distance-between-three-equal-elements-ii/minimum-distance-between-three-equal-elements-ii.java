class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Step 1: store indices
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int min = Integer.MAX_VALUE;

        // Step 2: check each group
        for (ArrayList<Integer> list : map.values()) {
            if (list.size() < 3) continue;

            for (int i = 0; i <= list.size() - 3; i++) {
                int a = list.get(i);
                int b = list.get(i + 1);
                int c = list.get(i + 2);

                int dist = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                min = Math.min(min, dist);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}