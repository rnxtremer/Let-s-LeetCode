class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int[] answer = new int[nums.length];
        int flag=0;
        for(int x=0;x<nums.length;x++){
            if(flag==0){
                answer[x]=nums[i];
                i++;
                flag=1;
            }
            else{
                answer[x]=nums[j];
                j++;
                flag=0;
            }
        }
        
        return answer;
    }
}