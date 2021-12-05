package Lesson4_JC;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание №1");

        System.out.println("Создать массив из 15 слов:");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("Один", "Два", "Три", "Четыре", "Пять", "Один", "Два", "Три", "Четыре", "Пять", "Один", "Три", "Восемь"));
        System.out.println(strList);

        System.out.println("Вывести список уникальных слов:");
        Set<String> uniqString = new HashSet<>(strList);
        System.out.println(uniqString);


        System.out.println("Подсчет повторяющихся слов:");

//        ArrayList<Integer> strFre = new ArrayList<>();          // Создание массива из значений, сколько раз каждое слово повторялось
//        for (String str : strList) {
//            strFre.add(Collections.frequency(strList, str));
//        }
//
//        HashMap<String, Integer> map = new HashMap<>();         // обьеденение исходного массива из слов с массивом значений, сколько раз каждое слово повторялось
//        for (int i = 0; i < strList.size(); i++) {
//            map.put(strList.get(i), strFre.get(i));
//        }

//        System.out.println(map);

        System.out.println("Второй способ:");

        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < strList.size(); i++) {
            int check = Collections.frequency(strList, strList.get(i));
            map2.put(strList.get(i), check);
        }
        System.out.println(map2);


        System.out.println("Задание №2");

        PhoneNumbers phoneList = new PhoneNumbers();
        phoneList.addPhone("Ivanov","89352654433");
        phoneList.addPhone("Kulikov","89642236514");
        phoneList.addPhone("Kulikov","89563487523");

        System.out.println(phoneList.getByName("Kulikov"));
        System.out.println(phoneList.getByName("Ivanov"));
        System.out.println(phoneList.getByName("Ivan"));


    }

}
