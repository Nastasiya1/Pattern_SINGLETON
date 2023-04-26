package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        Scanner scanner = new Scanner(System.in);
        int listSize = scanner.nextInt();
        System.out.println("ведите верхнюю границу для значений:");
        int upperLimit = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>(listSize);
        Random random = new Random();
        for(int i = 0; i < listSize; i++){
            source.add(random.nextInt(upperLimit));
        }
        System.out.println("Вот случайный список: " + source);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int filter = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter f = new Filter(filter);
        List<Integer> filteredList = f.filterOut(source);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredList);
        logger.log("Завершаем программу");
    }
}