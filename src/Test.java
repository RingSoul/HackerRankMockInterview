public class Test {
    public static void main(String[] args) {
        String answer = Solution.getSmallestAndLargest("welcometojava", 3);
        System.out.println(answer);
        System.out.println();
        answer = Solution.getSmallestAndLargest("WelcomeToJava", 3);
        System.out.println(answer);
        System.out.println();
        answer = Solution.getSmallestAndLargest("WelcomeToJava", 2);
        System.out.println(answer);
        System.out.println();
        answer = Solution.getSmallestAndLargest("WelcomeToJava", 5);
        System.out.println(answer);
        answer = Solution.getSmallestAndLargest("WelcomeToJava", 7);
    }
}
