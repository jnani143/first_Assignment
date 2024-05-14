class Solution {
    static int count_divisors(int N) {
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                if (i % 3 == 0)
                    count++;
                if (i != N / i && (N / i) % 3 == 0)
                    count++;
            }
        }
        return count;
    }
}
