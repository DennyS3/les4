
import java.util.Arrays;
import java.util.Scanner;

public class Les4 {
    public static void main(String[] args) {
        System.out.println("Задача 0");
        dz1();
        System.out.println("Задача 1");
        dz2();
        System.out.println("Задача 2");
        dz3();
        System.out.println("Задача 3");
        dz4();
        System.out.println("Задача 4");
        dz5();
        System.out.println("Задача 5");
        dz6();
    }

    /*0. Создайте массив целых чисел. Напишете программу, которая выводит
        сообщение о том, входит ли заданное число в массив или нет.
        Пусть число для поиска задается с консоли (класс Scanner).*/
    public static void dz1() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.random();
        }
        Arrays.sort(array);
        int rez = Arrays.binarySearch(array, num);
        if (rez >= 0) {
            System.out.println("заданное число входит в массив и находится в ячейке номер " + rez);
        } else if (rez < 0) {
            System.out.println("заданное число не входит в массив");
        }
    }

    /* 1. Создайте массив целых чисел. Удалите все вхождения заданного
     числа из массива.
     Пусть число задается с консоли (класс Scanner). Если такого числа нет -
     выведите сообщения об этом.
     В результате должен быть новый массив без указанного числа.*/
    public static void dz2() {
        System.out.println("Введите число которое надо удалить");
        Scanner scanner = new Scanner(System.in);
        Integer num[] = new Integer[]{1, 2, 3, 5, 4, 7, 8, 9, 6, 2, 4, 5, 8};
        int checknum = scanner.nextInt();
        Arrays.sort(num);
        int find = Arrays.binarySearch(num, checknum);
        if (find >= 0) {
            for (int i = 0; i < num.length; i++) {
                if (num[i] == checknum) {
                    num[i] = null;
                    continue;
                }
                System.out.print(num[i] + " ");
            }
        } else if (find < 0) {
            System.out.println("Данного числа нет в массиве");
        }
        System.out.println();
    }

    /* 2. Создайте и заполните массив случайным числами и выведете
     максимальное, минимальное и среднее значение.
     Для генерации случайного числа используйте метод Math.random().
     Пусть будет возможность создавать массив произвольного размера.
     Пусть размер массива вводится с консоли.*/
    public static void dz3() {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int[] array = new int[range];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            sum += array[i];
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное значение " + array[0] + ", " + "Среднее значение " + sum / range + ", " + "максимальное значение " + array[array.length - 1]);
    }

    /*3. Создайте 2 массива из 5 чисел.
        Выведите массивы на консоль в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и
        сообщите, для какого из массивов это значение оказалось больше (либо
        сообщите, что их средние арифметические равны).
        */
    public static void dz4() {
        System.out.println("среднее арифметическое");
        int a[] = new int[5], b[] = new int[5];
        int suma = 0, sumb = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
            b[i] = (int) (Math.random() * 10);
            suma += a[i];
            sumb += b[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if (suma / a.length > sumb / b.length) {
            System.out.println("В массиве А среднее арифмитеческое оказалось больше");
        } else if (suma / a.length < sumb / b.length) {
            System.out.println("В массиве B среднее арифмитеческое оказалось больше");
        } else {
            System.out.println("среднее арифметическое 2х массивов равно");
        }
    }

    /*  4. Создайте массив из n случайных целых чисел и выведите его на экран.
      Размер массива пусть задается с консоли и размер массива может быть
      больше 5 и меньше или равно 10.
      Если n не удовлетворяет условию - выведите сообщение об этом.
      Если пользователь ввёл не подходящее число, то программа должна
      просить пользователя повторить ввод.
      Создайте второй массив только из чётных элементов первого массива,
      если они там есть, и вывести его на экран.*/
    public static void dz5() {
        System.out.println("удалить нечетные числа из массива");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число от 5 до 10 влючительно:");
            int range = scanner.nextInt();
            if (range > 5 && range <= 10) {
                Integer[] a = new Integer[range];
                Integer chet = 0;
                for (int i = 0; i < a.length; i++) {
                    a[i] = (int) (Math.random() * 10);
                    if (a[i] % 2 == 0 && a[i] != 0) {
                        chet++;
                    }
                }
                System.out.println("Массив общий "+Arrays.toString(a));
                if (chet > 0) {
                    Integer[] b = new Integer[chet];
                    for (int i = 0; i < b.length; i++) {
                        for (int c = 0; c < a.length; c++) {
                            if (a[c] % 2 == 0 && a[c] !=0) {
                                b[i] = a[c];
                                a[c] = 0;
                                i++;
                                continue;
                            }else {continue;}
                        }
                    }
                    System.out.println("Массив четных чисел " + Arrays.toString(b));
                } else {
                    System.out.println("Четных чисел в массиве А не оказалось");
                }
                break;
            } else if (range < 5 || range > 10) {
                System.out.println("Введно не верное число, введите число от 5 до 10 включительно");
            }
        }
    }
/*5. Создайте массив и заполните массив.
    Выведите массив на экран в строку.
    Замените каждый элемент с нечётным индексом на ноль.
    Снова выведете массив на экран на отдельной строке.*/
    public static void dz6(){
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 !=0){
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
