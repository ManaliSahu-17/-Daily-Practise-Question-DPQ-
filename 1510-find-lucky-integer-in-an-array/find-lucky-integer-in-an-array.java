import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        // for(int number:arr){
        //     map.merge(number, 1, Integer::sum);

        // }

        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int ans =-1;
        for(Map.Entry<Integer,Integer> i :map.entrySet())
        {
            if (i.getKey().equals(i.getValue())) {
               ans = Math.max(ans, i.getKey()); 
            }
        }

        return ans;
        
    }
}