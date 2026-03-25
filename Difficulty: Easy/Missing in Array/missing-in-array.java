class Solution {
    int missingNum(int arr[]) {
        // code here
        int s1=0;
        for(int i=0; i<arr.length; i++)
        {
            s1=s1+arr[i];
        }
        int n=arr.length;
        int s2=0;
        for(int i=1;i<=n+1;i++)
        {
            s2=s2+i;  
        }
        return s2-s1;
    }
}