public class Fibo {
    public static void main(String[] args) {
        int ans = Fib(10);

        System.out.println(ans);
    }
    public static int Fib(int n){
if (n < 2){
    return n;
}

   return Fib(n - 1) + Fib(n - 2);
    }
}
