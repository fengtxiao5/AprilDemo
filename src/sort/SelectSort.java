package sort;

import java.util.Arrays;

/**
 * @Author: FengTengXiao
 * @Date: 2021/4/21 17:29
 */


public class SelectSort {
    public static int[] selectSort(int[] array){
        int length = array.length;
        int temp;
        for (int i = 0; i < length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i; j < length; j++) {
                if(array[j] < min){
                    index = j;
                    min = array[j];
                }
            }
            //i temp index
            //如果最小标记发生改变
            if(index != i){
                temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {10,1,9,2,8,3,7,4,6,5};

        System.out.println("原数组:" + Arrays.toString(array));
        System.out.println("排序1:" + Arrays.toString(selectSort(array)));
    }
}
