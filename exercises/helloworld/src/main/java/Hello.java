public class Hello {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int result = add(x, y);
        System.out.println(result);
    }

    public static int add(int a, int b) {
        int tmp = a + b;
        return tmp;
    }
}

