import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2 ,15, 0 ,3, 5, 12, 6, 8, 16, 7, 6, 6, 10, 1};
        int[] arrayQuick = {4 ,15, 1 ,3, -5, 12, 6, 8, 16, 7, 19, 6, 10, 1};

        //Вызов сортировки пузырьком
        Sort.bubbleSort(array);

        System.out.println("-----------------------------------------------------------------------");

        //Вызов быстрой сортировки
        Sort.quickSort(arrayQuick);
        if (arrayQuick != null && arrayQuick.length > 1) {
            System.out.println("Быстрая сортировка.");
            System.out.println("Отсортированный массив: " + Arrays.toString(arrayQuick));
        } else {
            System.out.println("Массив не нуждается в сортировке.");
        }
    }
}