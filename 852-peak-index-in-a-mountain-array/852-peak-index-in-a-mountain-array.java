class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        int i = 0;
        for( i = 1;i<arr.length;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
}