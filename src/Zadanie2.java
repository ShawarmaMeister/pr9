public class Zadanie2 {
    int count;

    public static void main(String[] args) {}

    public int getCount() { return count; }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}

/*      main — статический метод, так как это точка входа в программу.

        getCount — метод экземпляра, так как он использует переменную экземпляра count.

        factorial — статический метод, так как он не зависит от состояния объекта.       */