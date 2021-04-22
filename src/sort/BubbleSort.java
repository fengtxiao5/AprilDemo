package sort;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author: FengTengXiao
 * @Date: 2021/4/21 16:55
 */


public class BubbleSort {
    //自写
    public static int[] bubbleSort(int[] array){
        int length = array.length;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if(array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    //官方
    public static int[] sort(int[] sourceArray) {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {10,1,9,2,8,3,7,4,6,5};

        long l = System.currentTimeMillis();

        String sort1 = Arrays.toString(array);
        long l1 = System.currentTimeMillis();

        String sort2 = Arrays.toString(bubbleSort(array));
        long l2 = System.currentTimeMillis();

        String sort3 = Arrays.toString(sort(array));
        long l3 = System.currentTimeMillis();

        String a = String.valueOf(l1-l);
        String b = String.valueOf(l2-l);
        String c = String.valueOf(l3-l);
        System.out.println("原数组:" + Arrays.toString(array) + "时间:" + String.valueOf(l1-l));
        System.out.println("排序1:" + Arrays.toString(bubbleSort(array)) + "时间:" + String.valueOf(l2-l));
        System.out.println("排序2:" + Arrays.toString(sort(array)) + "时间:" + String.valueOf(l3-l));
    }
}
