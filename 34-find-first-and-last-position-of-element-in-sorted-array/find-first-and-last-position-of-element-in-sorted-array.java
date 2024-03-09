class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans [] = { -1,-1};
        int start = search(nums, target, true);
        int end  = search(nums, target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
        }
        int search(int []nums,int target, boolean findIndex)
        {   
            int ans = -1;
            int s = 0;
            int e = nums.length - 1;
            while(s <= e)
            {
                int mid = s + (e - s) / 2;
                if (target > nums[mid])
                {
                    s = mid + 1;
                }
                else if (target < nums[mid])
                {
                    e = mid - 1;
                }
                else
                {
                 if(target == nums[mid])
                {    ans = mid;

                    if(findIndex)
                    {
                        e = mid - 1;
                    }
                    else
                    {
                        s = mid + 1;
                    }
                }
                }
            }
            return ans;
        }
       
 
        
    }