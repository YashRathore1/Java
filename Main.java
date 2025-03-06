// Factorial of a Number
class Factorial{
    public int fact(int n) {
        if(n == 1) {
            return n;
        } else {
            return n * (fact(n - 1));
        }
    }
}

public class Main{
    public static void main(String a[]) {
        Factorial obj = new Factorial();
        System.out.println(obj.fact(5));
    }
}