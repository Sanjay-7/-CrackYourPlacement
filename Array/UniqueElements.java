class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i=0,j=1;
        while(j<n)
        {
            // we are just doing it as we want unique elements to be adjacent
            if(arr[i]!=arr[j])
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        //at this position we must have all unique elements
        return i+1;
    }
}
