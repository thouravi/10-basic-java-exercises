class Solution {
    public int subtractProductAndSum(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            int rem = n%10;
            arr.add(rem);
            n = n/10;
        }
        int product = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            product = product * arr.get(i);
            sum += arr.get(i);
        }
        int diff = product - sum;
        return diff;
    }
}
