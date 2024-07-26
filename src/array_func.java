public class array_func {
    public static boolean bi_search(int[] arr, int val)
    {
        //only works with sorted arrays
        int high = arr.length - 1, low = 0;
        while (high >= low)
        {
            int mid = (high + low) / 2;
            if (arr[mid] == val)
                return true;
            else if (arr[mid] > val)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
    public static int[] removeEven(int[] arr)
    {
        int oddCount = 0, size = arr.length;
        for (int i = 0; i < size; ++i)
        {
            if(arr[i] % 2 != 0)
                oddCount++;
        }
        int idx = 0;
        int[] oddNum = new int[oddCount];
        for (int i = 0; i < size; ++i)
        {
            if(arr[i] % 2 != 0){
                oddNum[idx] = arr[i];
                idx++;
            }
        }
        return oddNum;
    }
    public static int[] moveZeroesToEnd(int[] arr)
    {
        // 1  2 0 3 0 4 0 --> 1 2 3 4 0 0 0
        int j = 0;
        for(int i = 0; i < arr.length; ++i)
        {
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            if (arr[j] != 0)
                j++;
        }
        return arr;
    }
}
