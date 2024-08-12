import java.lang.reflect.Array;
import java.util.Arrays;

public class quickSort {
    // public static void printArray(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    //     System.out.println(); // Xuống dòng sau khi in hết mảng
    // }
    public void swap(int arr[], int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
 
    // ham de chia mang thanh 2 phan, su dung phan tu chot (pivot)
    public int partition(int arr[], int left, int right, int pivot) {
        int leftPointer = left ;
        int rightPointer = right-1;
 
        while (true) {
 
            while (arr[leftPointer] < pivot) {
                leftPointer++;
            }
 
            while (rightPointer > 0 && arr[rightPointer] >= pivot) {
                rightPointer--;
            }
 
            if (leftPointer >= rightPointer) 
                break;
             else 
                swap(arr, leftPointer, rightPointer);
            
 
        }
 

        swap(arr, leftPointer, right);
        System.out.println(Arrays.toString(arr));
        return leftPointer;
    }
 
    // ham sap xep
    public void quickSort(int arr[], int left, int right) {
        if (right - left <= 0) { // mảng nhỏ hơn 1
            return;
        } else {
            int pivot = arr[right];
            int partitionPoint = partition(arr, left, right, pivot);
            quickSort(arr, left, partitionPoint - 1);
            quickSort(arr, partitionPoint + 1, right);
        }
    }
 
    
 
    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = {1, 9,4,87,8,7,6,5,4,3,2,1};
 
        quickSort sapXepNhanh = new quickSort();
        System.out.println("Mang du lieu dau vao: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("-----------------------------");
        sapXepNhanh.quickSort(arr, 0, arr.length - 1);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        System.out.println(Arrays.toString(arr));
    }
}
