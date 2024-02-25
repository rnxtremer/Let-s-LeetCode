class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int right = n-1;
        int left = 0;
        int index[] = new int[2];
        while(left<right){
            if(numbers[left]+numbers[right] == target){
                index[0] = left+1;
                index[1] = right+1;
                return index;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
        return index;
    }
}