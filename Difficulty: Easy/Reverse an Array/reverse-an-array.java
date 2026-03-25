class Solution {
    public void reverseArray(int arr[]) {
        // code here
        
        for(int i=0;i<arr.length/2;i++)
        {
            int left = arr[i];
            int right = arr[arr.length - 1-i];
            
            arr[i] = right;
            arr[arr.length-1-i] = left;
        }
        
        
    }
}