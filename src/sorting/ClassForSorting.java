package sorting;

import java.util.Arrays;

public class ClassForSorting {

    private int[] array;

    public int[] getArray() {
        return array;
    }

    public ClassForSorting(int[] array) {
        this.array=array;
    }


    public void show() {
        System.out.println(Arrays.toString(array));
    }

    public void bubleSort() {
        int tmp;
        boolean flag=true;
        while (flag) {
            flag=false;
            for (int i=0, j=1; j < array.length; i++, j++) {
                if (array[i] > array[j]) {
                    tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                    flag=true;
                }
            }
        }
    }

}
