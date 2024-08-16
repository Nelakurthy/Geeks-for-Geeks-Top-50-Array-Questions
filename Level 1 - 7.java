class Solution 
{
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;  
        int currentSum = 0;  
        for (int end = 0; end < n; end++) 
        {
            currentSum += arr[end];  
            while (currentSum > s && start < end) 
            {
                currentSum -= arr[start];
                start++;
            }
            if (currentSum == s) 
            {
                result.add(start + 1);
                result.add(end + 1);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}
