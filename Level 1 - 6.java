class Solution
{
    public static void sort012(int a[], int n)
    {
         int low = 0;    
        int mid = 0;    
        int high = n - 1; 
        while (mid <= high) 
        {
            switch (a[mid]) 
            {
                case 0:
                    int temp0 = a[low];
                    a[low] = a[mid];
                    a[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = a[high];
                    a[high] = a[mid];
                    a[mid] = temp2;
                    high--;
                    break;
            }
        }
    }
}
