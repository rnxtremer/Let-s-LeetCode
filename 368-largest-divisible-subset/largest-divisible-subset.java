public class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);

        int[] gpSize = new int[nums.length];
        int[] prevelement = new int[nums.length];
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            gpSize[i] = 1;
            prevelement[i] = -1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && gpSize[i] < 1 + gpSize[j]) {
                    gpSize[i] = 1 + gpSize[j];
                    prevelement[i] = j;
                }
            }
            if(gpSize[i] > gpSize[maxIndex]) {
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList();
        while(maxIndex != -1) {
            result.add(0, nums[maxIndex]);
            maxIndex = prevelement[maxIndex];
        }

        return result;
    }
}