class Solution
{
    int findFrequency(int Arr[], int X)
    {
        int count = 0;
        for (int i = 0; i < Arr.length; i++) 
        {
            if (Arr[i] == X) 
            {
                count++;
            }
        }
        return count;
    }
}
