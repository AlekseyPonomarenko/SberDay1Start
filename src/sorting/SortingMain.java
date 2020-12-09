package sorting;

public class SortingMain {

    public static void main(String[] args) {
        //Написать сортировку пузырьком или бинарный поиск элемента в массиве

        System.out.println("Метод: сортировка пузырьком!");
        int[] example = getUnsortedArrayForExample();

        ClassForSorting forSorting = new ClassForSorting(example);
        System.out.println("Исходный массив:");
        forSorting.show();
        System.out.println("После сортировки пузырьком:");
        forSorting.bubleSort();
        forSorting.show();

    }

    public static int[] getUnsortedArrayForExample() {
        int[] result={7, 5, 8, 9, 4, 1, 6, 0, 11, 10, 15, 56, 54, 54, 78, 69, 45, 12, 17};
        return result;
    }
}
