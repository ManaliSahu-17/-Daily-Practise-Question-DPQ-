class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int index = Math.abs(nums[i])-1;// by this we take out element index ele=4 so index is 3
            if(nums[index]<0)
            continue;
            nums[index]*=-1;// this if any any element placed in that index let say at 3 mark as negative
        }


        for(int i=0;i<n;i++){
            if(nums[i]>0){ 
                // by this traverse the array again see any number greater than zero that means positive is there
                lst.add(i+1);
                // take out their index and add 1 so that we can get the real element placed in that index and which is missed in the given array
                // add to the list
            }
        }

        return lst;
    }
}