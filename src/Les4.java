
import java.util.Arrays;
import java.util.Scanner;

public class Les4 {
    public static void main(String[] args) {
        System.out.println("������ 0");
        dz1();
        System.out.println("������ 1");
        dz2();
        System.out.println("������ 2");
        dz3();
        System.out.println("������ 3");
        dz4();
        System.out.println("������ 4");
        dz5();
        System.out.println("������ 5");
        dz6();
    }

    /*0. �������� ������ ����� �����. �������� ���������, ������� �������
        ��������� � ���, ������ �� �������� ����� � ������ ��� ���.
        ����� ����� ��� ������ �������� � ������� (����� Scanner).*/
    public static void dz1() {
        System.out.println("������� �����");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.random();
        }
        Arrays.sort(array);
        int rez = Arrays.binarySearch(array, num);
        if (rez >= 0) {
            System.out.println("�������� ����� ������ � ������ � ��������� � ������ ����� " + rez);
        } else if (rez < 0) {
            System.out.println("�������� ����� �� ������ � ������");
        }
    }

    /* 1. �������� ������ ����� �����. ������� ��� ��������� ���������
     ����� �� �������.
     ����� ����� �������� � ������� (����� Scanner). ���� ������ ����� ��� -
     �������� ��������� �� ����.
     � ���������� ������ ���� ����� ������ ��� ���������� �����.*/
    public static void dz2() {
        System.out.println("������� ����� ������� ���� �������");
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
            System.out.println("������� ����� ��� � �������");
        }
        System.out.println();
    }

    /* 2. �������� � ��������� ������ ��������� ������� � ��������
     ������������, ����������� � ������� ��������.
     ��� ��������� ���������� ����� ����������� ����� Math.random().
     ����� ����� ����������� ��������� ������ ������������� �������.
     ����� ������ ������� �������� � �������.*/
    public static void dz3() {
        System.out.println("������� ������ �������");
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
        System.out.println("����������� �������� " + array[0] + ", " + "������� �������� " + sum / range + ", " + "������������ �������� " + array[array.length - 1]);
    }

    /*3. �������� 2 ������� �� 5 �����.
        �������� ������� �� ������� � ���� ��������� �������.
        ���������� ������� �������������� ��������� ������� ������� �
        ��������, ��� ������ �� �������� ��� �������� ��������� ������ (����
        ��������, ��� �� ������� �������������� �����).
        */
    public static void dz4() {
        System.out.println("������� ��������������");
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
            System.out.println("� ������� � ������� �������������� ��������� ������");
        } else if (suma / a.length < sumb / b.length) {
            System.out.println("� ������� B ������� �������������� ��������� ������");
        } else {
            System.out.println("������� �������������� 2� �������� �����");
        }
    }

    /*  4. �������� ������ �� n ��������� ����� ����� � �������� ��� �� �����.
      ������ ������� ����� �������� � ������� � ������ ������� ����� ����
      ������ 5 � ������ ��� ����� 10.
      ���� n �� ������������� ������� - �������� ��������� �� ����.
      ���� ������������ ��� �� ���������� �����, �� ��������� ������
      ������� ������������ ��������� ����.
      �������� ������ ������ ������ �� ������ ��������� ������� �������,
      ���� ��� ��� ����, � ������� ��� �� �����.*/
    public static void dz5() {
        System.out.println("������� �������� ����� �� �������");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("������� ����� �� 5 �� 10 �����������:");
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
                System.out.println("������ ����� "+Arrays.toString(a));
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
                    System.out.println("������ ������ ����� " + Arrays.toString(b));
                } else {
                    System.out.println("������ ����� � ������� � �� ���������");
                }
                break;
            } else if (range < 5 || range > 10) {
                System.out.println("������ �� ������ �����, ������� ����� �� 5 �� 10 ������������");
            }
        }
    }
/*5. �������� ������ � ��������� ������.
    �������� ������ �� ����� � ������.
    �������� ������ ������� � �������� �������� �� ����.
    ����� �������� ������ �� ����� �� ��������� ������.*/
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
