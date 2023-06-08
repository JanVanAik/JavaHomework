//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
package Lesson_1;

public class task_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 7, 33, 456, 1, -100, 33};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Minimum is " + min + ", Maximum is " + max);
    }
}