class Solution {

    public int numSquares(int n) {
        if (n <= 0) {
            return 0;
        }

        int[] arr = new int[n + 1];
        arr[0] = 0;

        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            for (int j = square; j <= n; j++) {
                if (arr[j] == 0 || arr[j] > arr[j - square] + 1) {
                    arr[j] = arr[j - square] + 1;
                }
            }
        }

        return arr[n];
    }
}
