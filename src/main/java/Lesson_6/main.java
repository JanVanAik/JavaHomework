package Lesson_6;


import java.util.*;

public class main {
    public static String ArrayFilter(ArrayList UserArr) {
        String Result = new String();
        for (int i = 0; i < UserArr.size(); i++) {
            Result += i + ": " +UserArr.get(i) + ";\n";
        }
        return Result;
    }

    public static void main(String[] args) {


//        Подготовка видов полей
//        Реализована Не очень удачно((
        String[] Fields = new String[]{"Model", "Manufacturer", "Color", "Ram"};
        ArrayList<String> FieldsArray = new ArrayList<>();
        Collections.addAll(FieldsArray,Fields);
        String[] Models = new String[]{"PocketBook", "Laptop", "NoteBook", "TablePc", "Phone"};
        ArrayList<String> ModelArray = new ArrayList<>();
        Collections.addAll(ModelArray,Models);
        String[] Manufacturers = new String[]{"Dell", "Apple", "Lg", "PETROVICH", "Skynet"};
        ArrayList<String> ManufacturerArray = new ArrayList<>();
        Collections.addAll(ManufacturerArray,Manufacturers);
        String[] Colors = new String[]{"Blue", "SuperBlue", "Camo", "Rainbow", "ULTRAMODNIYBLACK"};
        ArrayList<String> ColorArray = new ArrayList<>();
        Collections.addAll(ColorArray,Colors);
        String[] Ram = new String[]{"2Gb", "4GB", "8GB", "0GB", "16GB"};
        ArrayList<String> RamArray = new ArrayList<>();
        Collections.addAll(RamArray,Ram);

//        Сам массив склада
        ArrayList <String>  storage = new ArrayList<>();

//        Генерация склада
        for (int i = 1; i <= 100; i++) {
            Random random = new Random();
            int id = random.nextInt(Models.length);
            Task_1 NewObject = new Task_1(Models[id], Manufacturers[id],
                    Colors[id], Ram[id], (int)Math.floor(Math.random() *(350000 - 70000 + 1) + 70000));
            storage.add(NewObject.toString());
        }


//        Фильтрация - вывод
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose required parameter for sorting \n" + ArrayFilter(FieldsArray));
        String UserInput = scanner.nextLine();
        if(UserInput.equals("0")) {
            System.out.println("Type required parameter \n" + ArrayFilter(ModelArray));
        }
        else if(UserInput.equals("1")) {
            System.out.println("Type required parameter \n" + ArrayFilter(ManufacturerArray));
        }
        else if(UserInput.equals("2")) {
            System.out.println("Type required parameter \n" + ArrayFilter(ColorArray));
        }
        else if(UserInput.equals("3")) {
            System.out.println("Type required parameter \n" + ArrayFilter(RamArray));
        }

        String FilterInput = scanner.nextLine();
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).contains(FilterInput)){
                System.out.println(storage.get(i));
            }
        }


    }
}
