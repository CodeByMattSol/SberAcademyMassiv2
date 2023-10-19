package org.main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[10]; // Создание пустого массива с 10 элементами
        int answer, k;

        answer = 0;

        for (int i = 0; i < 10; i++) {
            k = random.nextInt(900) + 100; // Генерация числа

            answer += k; // Считаем сумму
            arr[i] = k; // Добавляем в массив

            if (i != 9) {   // выводим элементы массива
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Сумма чисел массива: " + answer);

    }
}