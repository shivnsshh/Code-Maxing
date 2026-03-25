// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int temp=n;
        while(temp!=0)
        {
            int d=temp%10;
            sum = sum+(d*d*d);
            temp=temp/10;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
}