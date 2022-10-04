public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] exampleOne = new int[]{1, 3, 5, 6};
        int targetOne = 5;

        int[] exampleTwo = new int[]{1, 3, 5, 6};
        int targetTwo = 2;

        int[] exampleThree = new int[]{1, 3, 5, 6};
        int targetThree = 7;

        System.out.println("Example one : " + solution.searchInsert(exampleOne, targetOne));
        System.out.println("Example two : " + solution.searchInsert(exampleTwo, targetTwo));
        System.out.println("Example three : " + solution.searchInsert(exampleThree, targetThree));
    }
}
