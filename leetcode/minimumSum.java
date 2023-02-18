class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (num > 0) {
            int rem = num%10;
            arr.add(rem);
            num = num/10;
        }
        Collections.sort(arr);
        return (arr.get(0)*10 + arr.get(2) + arr.get(1)*10 + arr.get(3));
    }
}
