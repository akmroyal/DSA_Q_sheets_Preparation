// Array Subset of Another Array : https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=1&sprint=94ade6723438d94ecf0c00c3937dad55&sortBy=submissions

import java.util.*;

public class Main
{
    public static boolean arrSubset(int a1[],int a2[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : a1){
            // if(!hm.containsKey(a1[i])){
            //     hm.put(a1[i],1);
            // }else{
            //     hm.put(a1[i],hm.get(a1[i]) + 1);
            // }
            hm.put(i,hm.getOrDefault(i,0) + 1); // we can also use it 
        }
        // System.out.println(hm);
        for(int i=0;i<a2.length;i++){
            if(hm.containsKey(a2[i]) && hm.get(a2[i]) > 0){
                hm.put(a2[i],hm.get(a2[i])-1);
            }else{
                return false;
            }
        }
        // System.out.println(hm);
        return true;
    }
	public static void main(String[] args) {
		int ar[]={11, 7, 1, 13, 21, 3, 7, 3};
		int arr[] = {11, 3, 7, 1, 7, 3};
		if(arrSubset(ar,arr)){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}
