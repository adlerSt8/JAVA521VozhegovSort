import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 15, 0, 3, 5, 12, 6, 8, 16, 7, 6, 6, 10, 1};
        int[] arrayQuick = {4, 15, 1, 3, -5, 12, 6, 8, 16, 7, 19, 6, 10, 1};

        //Вызов сортировки пузырьком
        Sort.bubbleSort(array);

        System.out.println("-----------------------------------------------------------------------");

        long startTime = System.nanoTime();
        //Вызов быстрой сортировки
        Sort.quickSort(arrayQuick);

        long endTime = System.nanoTime();
        long sumTime = endTime - startTime;
        System.out.println("Время выполнения быстрой сортировки: " + sumTime + " наносекунд. Или " +
                (double) sumTime / 1_000_000 + " милисекунд.");

        if (arrayQuick != null && arrayQuick.length > 1) {
            System.out.println("Быстрая сортировка.");
            System.out.println("Отсортированный массив: " + Arrays.toString(arrayQuick));
        } else {
            System.out.println("Массив не нуждается в сортировке.");
        }
    }
}