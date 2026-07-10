class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length+1;
        int sum = (n*(n-1))/2;
        int arraysum = 0;
        for (int ele : arr){
            arraysum += ele;
        }
        return sum-arraysum;
    }
}