package activity;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("START OF PROGRAM");

        //Test print
        System.out.println();
        System.out.println("Test print method");
        Function.print(new int[]{1, 2, 4, 6, 9});
        System.out.println();

        //Test getTargetCount
        System.out.println();
        System.out.println("Test getTargetCount method");
        System.out.println(Function.getTargetCount(new int[]{1, 2, 8, 2, 7, 4, 2, 6, 8, 7, 8, 4, 2, 4, 2, 4, 9},2));
        System.out.println(Function.getTargetCount(new int[]{1, 2, 8, 2, 7, 4, 2, 6, 8, 7, 8, 4, 2, 4, 2, 4, 9},4));
        System.out.println(Function.getTargetCount(new int[]{1, 2, 8, 2, 7, 4, 2, 6, 8, 7, 8, 4, 2, 4, 2, 4, 9},8));
        System.out.println();

        //Test indexOf
        System.out.println("Test indexOf method");
        System.out.println(Function.indexOf(new int[]{1, 2, 4, 6, 7, 9},2));
        System.out.println(Function.indexOf(new int[]{1, 2, 4, 6, 7, 9},7));
        System.out.println(Function.indexOf(new int[]{1, 2, 4, 6, 7, 9},8));

        //Test replaceAll
        System.out.println();
        System.out.println("Test replaceAll method");
        Function.replaceAll(new int[]{1, 2, 4, 2, 2, 6, 6, 2, 7, 6, 2, 9},2,5);

        //Test insert
        System.out.println();
        System.out.println("Test insert method");
        Function.insert(new int[]{1, 2, 4, 5, 7, 8, 9});
    }
}
