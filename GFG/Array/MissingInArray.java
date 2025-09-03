class Solution {
    int missingNum(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            if(i+1!=arr[i]){
                return i+1;
            }
        }
        
        return arr.length+1;
        
    }
}