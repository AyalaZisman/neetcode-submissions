class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        final int n = nums.length;
        final int nSubsets = 1 << n;
        final List<List<Integer>> res = new ArrayList<>(nSubsets);

        for (int bitmask = 0; bitmask < nSubsets; ++bitmask) {
            final List<Integer> subset = new ArrayList<>(Integer.bitCount(bitmask));

            for (int i = 0; i < n; ++i) {
                if ((bitmask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            res.add(subset);
        }

        return res;
    }
}
