public class SumForLoop {
    public static void main(String[] args) {

        //Sum 1-1000 using for loop.......
        int sum = 0;
        int n = 1000;
        for (int i = 1; i <= n; ++i) {
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
}

