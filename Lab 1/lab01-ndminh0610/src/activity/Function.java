package activity;
import java.util.Arrays;

public class Function {
    public static void print(int[] list) {
        System.out.print("[");
        for (int i = 0; i < list.length - 1; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.print(list[list.length - 1] + "]");
    }
    public static int getTargetCount(int[] list, int target) {
        int counter = 0;
        for (int num : list) {
            if (num == target) {
                counter += 1;
            }
        }
        return counter;
    }
    public static int indexOf(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void replaceAll(int[] list, int key, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                list[i] = value;
            }
        }
        System.out.println(Arrays.toString(list));
    }
    public static void insert(int[] list) {
        int temp;
        int lastNum = list[list.length - 1];
        if (list.length % 2 == 0) {
            temp = (list.length / 2) - 1;
        } else {
            temp = list.length / 2;
        }
        for (int i = list.length - 1; i > temp; i--) {
            list[i] = list[i - 1];
        }
        list[temp] = lastNum;
        System.out.println(Arrays.toString(list));
    }
}
