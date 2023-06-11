
//4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//        или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
//        Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево)
//        -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

package Lesson_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  n: ");
        Integer CycleAmt = sc.nextInt();
        Integer Tmp;
        if (CycleAmt > 0){
            for (int i = 0; i < CycleAmt; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (CycleAmt > 0) {
                        Tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = Tmp;
                    }
                }
            }
        }
        if (CycleAmt < 0) {
            for (int i = 0; i < Math.abs(CycleAmt); i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    Tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = Tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}