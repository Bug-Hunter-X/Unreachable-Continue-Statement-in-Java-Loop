public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i++);
            if (i == 5) {
                break; // Exits the loop
            }
            //The unreachable code has been removed
        }
    }
}