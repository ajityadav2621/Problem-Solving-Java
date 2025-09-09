// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum==0){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                result.add(pair);
                
                int currentI = arr[i];
                int currentJ = arr[j];
                i++;
                j--;
                
                while (i < j && arr[i] == currentI) {
                    i++;
                }
                while (i < j && arr[j] == currentJ) {
                    j--;
                }
            } else if (sum < 0) {
                i++;
            } else {
                j--;
            }
        }
        
        return result;
}
}
