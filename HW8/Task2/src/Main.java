import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Задание
//        Написать программу, которая сгенерирует случайный вес 10 людям в пределах от 40 до 100 кг.
//        (Нужно самостоятельно найти информацию, как генерировать числа в заданном диапазоне).
//
//        Далее вам нужно будет вычислить несколько показателей:
//        1. Средний вес всех людей.
//        2. Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно.


        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = (new Random().nextDouble() * 60) + 40;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        double weight = 0;

        for (int i = 0; i < array.length; i++) {
            weight = weight + array[i];

        }
        System.out.println("Средний вес: " + weight / array.length);

        int cout = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 60 && array[i] <= 80) {
                ++cout;
            }
        }
         System.out.println("Количество людей у которых вес находится в промежутке от 60 до 80 кг включительно: " + cout);


    }
}
