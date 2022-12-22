public class Main {
    public static void main(String[] args) {
        System.out.println(solution(10, 11));
    }

    @SuppressWarnings("SameParameterValue")
    static int solution(int n, int m) {
        return ~(n ^ m) & ((n ^ m) + 1);
    }
}