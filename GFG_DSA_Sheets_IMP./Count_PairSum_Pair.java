// This is Java Soltuion for the Problem of : Count pair With sum 
// Link : https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        Map<Integer,Integer> mp = new HashMap();
        int res = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > k) continue;
            int x = k - arr[i];
            res += mp.getOrDefault(x,0);
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        return res;
    }
}
