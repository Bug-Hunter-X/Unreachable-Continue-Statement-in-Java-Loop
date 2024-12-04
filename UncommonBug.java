public class UncommonBug {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
            if (i == 5) {
                break; // Normal break, exits the loop
            }
            if (i == 7) {
                continue; // Unreachable because the loop is broken at i == 5
            }
        }
    }
}