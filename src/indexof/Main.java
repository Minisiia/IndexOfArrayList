package indexof;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Лариса Вікторівна Колісніченко");
        teachers.add("Олена Михайлівна Короленко");
        teachers.add("Світлана Миколаївна Герасименко");
        teachers.add("Анатолій Михайлович Попов");
        teachers.add("Лідія Сергіївна Коровкіна");
        System.out.println(teachers);
        System.out.println("Індекс найкращого вчителя: " + teachers.indexOf("Анатолій Михайлович Попов"));
        System.out.println("Індекс найгіршого вчителя: " + teachers.indexOf("Олена Михайлівна Короленко"));
    }
}
