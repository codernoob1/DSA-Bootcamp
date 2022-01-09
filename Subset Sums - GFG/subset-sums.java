// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}
// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        print(arr,0,0,ans,N);
        Collections.sort(ans);
        return ans;
       
    }
    void print(ArrayList<Integer> arr,int sum,int ind,ArrayList<Integer> ans,int N){
        if (ind>=arr.size()){
            ans.add(sum);
            return;
        }
        print(arr,sum+arr.get(ind),ind+1,ans,N);
        
        print(arr,sum,ind+1,ans,N);
        
    }
}