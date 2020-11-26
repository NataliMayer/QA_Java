package com.academy.lessons8;

import com.academy.lessons4.Abonent;

import java.util.Arrays;
import java.util.Random;

public class Generate {
    private static Object Gender;



    public static void main(String[] args) {
        //Архип,Болеслав,Марат,Семён,Юлиан,Сергей,Нифонт,Максим,Евгений,Геннадий,Володар,Ждан,Марк,Григорий,Леонид,Олег
        String[] maleNames = {"Архип","Болеслав","Марат","Семён","Юлиан","Сергей","Нифонт","Максим",
                "Евгений","Геннадий","Володар","Ждан","Марк","Григорий","Леонид","Олег"};
        // Массив имен
        String[] femaleNames = {"Виктория","Дария","Арина","Зоя","Лиза","Мария","Надя",
                "Раиса","Тамара","Октябрина","Рая","Роза","Нелли","Милана","Любовь","Леся","Каролина","Зинаида","Карина","Клавдия"};

        String[] maleLastNames = {"Смирнов","Иванов","Кузнецов","Попов","Соколов","Лебедев","Козлов",
                "Новиков","Морозов","Петров","Волков","Соловьёв","Васильев","Зайцев","Павлов"};

        String [] femaleLastNames = {"Ковалёва","Ильина","Гусева","Титова","Кузьмина","Кудрявцева","Баранова","Куликова","Алексеева",
                "Степанова","Яковалева","Сорокина","Сергеева","Романова","Захарова","Борисова"};

        Random random = new Random();
        Abonent[] abonents = new Abonent[10]; // 10
        char[] arrayG = {'m','f'};
        for (int i = 0;i < abonents.length;i++){
            char tmp = arrayG[random.nextInt(arrayG.length)];
            if(tmp =='m') {
                abonents[i] = new Abonent(maleNames[random.nextInt(maleNames.length)]);
            }
        }



        // for by abonents
        for (int i = 0; i < abonents.length; i++) {
            Abonent abonent = new Abonent(); // поместить в массив
            int nextNameIndex = random.nextInt(maleNames.length);
            int nextmaleLastNameIndex = random.nextInt(maleLastNames.length);

            String nextmaleNames = maleNames[nextNameIndex];// "Вася";
            String maleLastName = maleLastNames[nextmaleLastNameIndex];

            abonent.setFirstName(nextmaleNames);
            abonent.setLastName(maleLastName);
            abonent.setGender((com.academy.lessons4.Gender) Gender);
            abonents[i] = abonent;
        }

        // вывод на консоль
        System.out.println(Arrays.toString(abonents));
    }
}