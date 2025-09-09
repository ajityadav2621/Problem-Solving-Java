class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        Arrays.sort(arr);

ArrayList<Integer> MissingData = new ArrayList<>();
ArrayList<Integer> DuplicateData = new ArrayList<>();
ArrayList<Integer> ReturnBoth = new ArrayList<>();

for (int i = 0; i < arr.length - 1; i++) {
    if (arr[i] == arr[i + 1]) {
        if (DuplicateData.isEmpty() || DuplicateData.get(DuplicateData.size() - 1) != arr[i]) {
            DuplicateData.add(arr[i]);
        }
    }
}

int expected = 1;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == expected) {
        expected++;
    } else if (arr[i] > expected) {
        while (expected < arr[i]) {
            MissingData.add(expected++);
        }
        expected++;
    }
}

while (expected <= arr.length) MissingData.add(expected++);

ReturnBoth.addAll(DuplicateData);
ReturnBoth.addAll(MissingData);

return ReturnBoth;

    }
}