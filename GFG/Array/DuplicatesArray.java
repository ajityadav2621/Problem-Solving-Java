class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        ArrayList<Integer> duplicates = new ArrayList<>();
        
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                duplicates.add(arr[i]);
            }
        }
        
        return duplicates;
    }
}