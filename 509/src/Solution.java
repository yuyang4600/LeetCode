public class Solution {
    public int fib(int N) {
        if (N == 1) {
            return 1;
        }
        if (N == 0) {
            return 0;
        }
        int fn = fib(N - 1) + fib(N - 2);

        return fn;
    }
    public int fib2(int N) {
        if (N <= 1) {
            return N;
        }

        int[] arr = new int[N + 1];
        arr[1] = 1;
        for (int i = 2; i < arr.length; i ++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[N];
    }


    int fib3(int N) {
        if (N <= 1) {
            return N;
        }
        int[][] A = new int[][]{{1, 1}, {1, 0}};
        matrixPower(A, N-1);

        return A[0][0];
    }

    void matrixPower(int[][] A, int N) {
        if (N <= 1) {
            return;
        }
        matrixPower(A, N/2);
        multiply(A, A);

        int[][] B = new int[][]{{1, 1}, {1, 0}};
        if (N%2 != 0) {
            multiply(A, B);
        }
    }

    void multiply(int[][] A, int[][] B) {
        int x = A[0][0] * B[0][0] + A[0][1] * B[1][0];
        int y = A[0][0] * B[0][1] + A[0][1] * B[1][1];
        int z = A[1][0] * B[0][0] + A[1][1] * B[1][0];
        int w = A[1][0] * B[0][1] + A[1][1] * B[1][1];

        A[0][0] = x;
        A[0][1] = y;
        A[1][0] = z;
        A[1][1] = w;
    }


    public int fib4(int N) {
        System.out.println(Math.sqrt(5));
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        System.out.println(Math.pow(goldenRatio, N));

        return (int)Math.round(Math.pow(goldenRatio, N)/ Math.sqrt(5));
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fib4(4));
    }


}
