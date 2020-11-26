package com.academy.lessons10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        String[] names = {"Архип","Болеслав","Марат","Семён","Юлиан","Сергей","Нифонт","Максим","Евгений","Геннадий","Володар","Ждан","Марк","Григорий","Леонид","Олег"};

        List<String> nameList = new ArrayList<>(Arrays.asList(names));// из масива переместить данные в колекцию

        //nameList.add(); добавить в колекцию
        nameList.remove("Марат");// удалить по обьекту
        "s1".compareTo("s2");
        nameList.sort((s1,s2) -> {
            if (s1.equals(s2))
                return 0;
            if( s1.compareTo(s2) < 0);
            return -1;


        }) ;
        nameList.sort(String::compareTo);

            for (int i = 0; i < nameList.size(); i++){
                if (nameList.get(i).charAt(0) == 'С') ;
            {
                System.out.println(nameList.get(i));
            }
        }



        System.out.println(nameList);

    }
}
