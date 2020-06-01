import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BaseSort {
    private int[] arr;

    @Before
    public void init() {
       int[] temp = {1,3,8,10,2,4,9,10,2,0,-1};
       /*
            1,3,8,10,2,4,9,10,2,0,-1
        */





       arr = temp;
    }

    @Test
    public void upBubbleSort() {
        for(int i=0;i<arr.length;i++) {
            for(int j=arr.length-1;j>i;j--) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    @Test
    public void downBubbleSort() {
        for(int i=arr.length-1;i>=0;i--) {
            for(int j=0;j<i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    @Test
    public void selectSort() {
        for(int i = 0;i<arr.length;i++) {
            int index = i;
            for(int j= i+1;j<arr.length;j++) {
                if(arr[index] > arr[j]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] =  arr[index];
            arr[index] = temp;
        }
    }

    @Test
    public void insertSort() {
        for(int i=1;i<arr.length;i++) {
           int index = i;
           for(int j=i-1;j>=0;j--) {
               if(arr[j] > arr[index]) {
                   int temp = arr[j];
                   arr[j] = arr[index];
                   arr[index] = temp;
                   index = j;
               }else {
                   break;
               }
           }
        }
    }

    @Test
    public void shellSort() {
        int h = 1;
        while(h < arr.length/2) {
            h = 2*h +1;
        }
        while(h>=1) {
            for(int i=h;i<arr.length;i++) {
                for(int j=i;j>h-1;j-=h) {
                    if(arr[j] < arr[j-h]) {
                        int temp = arr[j];
                        arr[j] = arr[j-h];
                        arr[j-h] = temp;
                    }else {
                        break;
                    }
                }
            }
            h /= 2;
        }
    }

    @After
    public void print() {
        System.out.println(Arrays.toString(arr));
    }

}
