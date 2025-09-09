// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                result.add(pair);
                
                int leftVal = arr[i];
                int rightVal = arr[j];
                
                // move i forward skipping duplicates
                while (i < j && arr[i] == leftVal) {
                    i++;
                }
                // move j backward skipping duplicates
                while (i < j && arr[j] == rightVal) {
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
