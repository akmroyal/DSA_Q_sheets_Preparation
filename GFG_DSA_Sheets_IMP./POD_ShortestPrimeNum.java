// Its POD Question of GFG or the Topic of Graph DSA [Link] - https://www.geeksforgeeks.org/problems/shortest-prime-path--141631/1
// Shortest prime path : 
/* Shortest Explaination : 
num1 = 1033 
num2 = 8179
Output: 6
Explanation:
1033 -> 1733 -> 3733 -> 3739 -> 3779 -> 8779 -> 8179.
There are only 6 steps reuired to reach num2 from num1. 
and all the intermediate numbers are 4 digit prime numbers.
*/

class Solution{
    int solve(int num1,int num2){
        //code here
        int p[] = new int[10000];
        for(int i=2;i<10000;i++){
            if(p[i] == 0){
                for(int j=i*i;j<10000;j+=i){
                    p[j] = 1;
                }
            }
        }
        
        int ans[] = new int[10000];
        Arrays.fill(ans,-1);
        ans[num1] = 0;
        Queue<Integer> q = new LinkedList();
        q.add(num1);
        while(q.size()>0){
            int n = q.remove();
            for(int i=0;i<4;i++){
                for(int j=0;j<10;j++){
                    if(i==0&&j==0)continue;
                    String str = Integer.toString(n);
                    String nstr = str.substring(0,i) + Integer.toString(j) + str.substring(i+1); // 
                    int next = Integer.valueOf(nstr);
                    
                    if(p[next]==0 && ans[next] == -1){
                        ans[next] = 1 + ans[n];
                        q.add(next);
                    }
                }
            }
        }
        return ans[num2];
    }
}
