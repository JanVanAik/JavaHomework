//2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
// диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
package Lesson_1;

public class task_2 {
    public static void main(String[] args) {
        int[][] UserArray = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    UserArray[i][j] = 1;
                }
            }

        }
        System.out.println("The 2D array is: ");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(UserArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}