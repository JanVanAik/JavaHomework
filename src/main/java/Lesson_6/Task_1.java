package Lesson_6;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedMap;

public class Task_1 {
    String model, manufacturer, color, ram;
    Integer price;
    public Task_1(String md, String mf, String cl, String r, Integer pr){
        this.model = md;
        this.manufacturer = mf;
        this.color = cl;
        this.ram = r;
        this.price = pr;
    }


    @Override
    public String toString() {
        return "{" + "model = '" + model + "\' AND" +
                " " + "manufacturer = '" + manufacturer + "\' AND" +
                " " + "color = '" + color + "\' AND" +
                " " + "RamSize = '" + ram + "\' AND" +
                " " + "price = '" + price + "\'" +'}';
    }

    public String TypeChoice(ArrayList ChoiceList){
        String Result = new String();
        for (int i = 0; i < ChoiceList.size(); i++) {
            Result += i + ": " + ChoiceList.get(i) + ";\n";
        }
        return Result;
    }

//    @Override
//    public String toString() {
//        return "{" + "model='" + model + '\''+ '}';
//    }
}
