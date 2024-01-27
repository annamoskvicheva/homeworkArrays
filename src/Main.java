import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
       //task5();
    }
    public static void task1(){
        System.out.println("Задача 1");
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
        //Массив сразу заполните значениями.
        //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите
        //способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        System.out.println("Первый массив");
        int[] arrays1 = new int[] {1,2,3};
        System.out.println(arrays1[0]);
        System.out.println(arrays1[1]);
        System.out.println(arrays1[2]);
        System.out.println("Второй массив");
        double[] arrays2 = {1.57, 7.654, 9.986};
        System.out.println(arrays2.length + " это длина массива");
        System.out.println(arrays2[0]);
        System.out.println(arrays2[1]);
        System.out.println(arrays2[2]);
        System.out.println("Третий массив");
        int[] arrays3Table = new int[6];
        System.out.println(arrays3Table.length + "сколько всего предметов в массиве");
        int macbook = 1;
        int lamp = 1;
        int notebook = 3;
        int pen = 5;
        int pencil = 2;
        int airpods = 1;
        arrays3Table[0] = macbook;
        arrays3Table[1] = lamp;
        arrays3Table[2] = notebook;
        arrays3Table[3] = pen;
        arrays3Table[4] = pencil;
        arrays3Table[5]= airpods;
        System.out.println("Опишем эти предметы  и их количество: ");
        System.out.println("macbook " + arrays3Table[0]);
        System.out.println("lamp " + arrays3Table[1]);
        System.out.println("notebook " + arrays3Table[2]);
        System.out.println("pen " + arrays3Table[3]);
        System.out.println("pencil " + arrays3Table[4]);
        System.out.println("airpods " + arrays3Table[5]);
    }
    public static void task2(){
        System.out.println("Задача 2");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        //В конце строки запятую ставить не надо.
        System.out.println("Первый массив");
        int[] arrays1 = new int[] {1,2,3};
        System.out.println(arrays1[0] + ", "+arrays1[1] + ", " + arrays1[2] + ".");
        System.out.println("Второй массив");
        double[] arrays2 = {1.57, 7.654, 9.986};
        System.out.println(arrays2[0] + ", " + arrays2[1] + ", " + arrays2[2] + ".");
        System.out.println("Третий массив");
        int[] array3 = {1,1,3,5,2,1};
        System.out.println(array3[0] + ", " + array3[1] + ", " + array3[2] + ", " + array3[3] + ", " +
                + array3[4] + ", " + array3[5] + ".");
    }
    public static void task3(){
        System.out.println("Задача 3");
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        //В конце строки запятую ставить не надо.
        System.out.println("Первый массив");
        int[] arrays1 = new int[] {1,2,3};
        System.out.println(arrays1[2] + ", "+arrays1[1] + ", " + arrays1[0] + ".");
        System.out.println("Второй массив");
        double[] arrays2 = {1.57, 7.654, 9.986};
        System.out.println(arrays2[2] + ", " + arrays2[1] + ", " + arrays2[0] + ".");
        System.out.println("Третий массив");
        int[] array3 = {1,1,3,5,2,1};
        System.out.println(array3[5] + ", " + array3[4] + ", " + array3[3] + ", " + array3[2] + ", " +
                + array3[1] + ", " + array3[0] + ".");
    }
    public static void task4(){
        System.out.println("Задача 4");
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //Распечатайте результат преобразования в консоль.
        //это мое решение, не смогла здесь разобраться с циклом
        int [] arr = {1, 2, 3};
        int a = 1;
        arr[0] = 1 + a;
        arr[2] = 3 + a;
        for (int i = 0; i <= 0 ; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }
    public static void task5(){
        //в этом решение есть цикл с использование условного оператора
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 != 0) {   // тут проверяем чтобы число было четное
                arr[i] += 1;        // прибавка +1 как в условиях сказано
            }
        System.out.println(Arrays.toString(arr));
    }
}

