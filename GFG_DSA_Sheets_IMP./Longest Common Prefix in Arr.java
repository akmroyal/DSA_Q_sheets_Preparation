// This is Easy problem of the GFG which is having IMP Concept for the future programming 
// link : https://www.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1?page=1&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions

class Solution{
    String compare(String a, String b){
        int i=0,j=0;
        String ret = "";
        while(i<a.length() && j<b.length()){
            if(a.charAt(i) == b.charAt(j)){
                ret += String.valueOf(a.charAt(i));
                
            }else{
                return ret;
            }
            i++;
            j++;
        }
        return ret;
    }
    String longestCommonPrefix(String arr[], int n){
        // code here
        String ans = arr[0];
        for(int i=0;i<n-1;i++){
            String st = compare(ans,arr[i+1]);
            if(st.equals("")) return "-1";
            ans = st;
        }
        return ans;
    }
}
