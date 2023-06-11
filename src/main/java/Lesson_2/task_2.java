package Lesson_2;

import com.sun.tools.jconsole.JConsolePlugin;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sml = new SimpleFormatter();
        fh.setFormatter(sml);
        int [] arr = {7, 5, 33, 14, 185, 10000, 1};
        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]) {
                    isSorted = false;

                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    logger.info("Элементы " + arr[i] + " и " + arr[i+1] + " перемещены");
                } else {
                    logger.info("Изменений нет");
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

