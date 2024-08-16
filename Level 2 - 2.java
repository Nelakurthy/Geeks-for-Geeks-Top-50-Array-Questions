class Solution 
{
    public int missingNumber(int n, int arr[]) 
    {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) 
        {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
