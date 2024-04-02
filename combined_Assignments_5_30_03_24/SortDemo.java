
interface Sortable {
    public int[] sortable(int[] array);

}

class BubbleSort implements Sortable {
    public int[] sortable(int[] arr) {
        int n = arr.length;
        int swap = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < (n - j - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                }
            }

        }
        return arr;
    }
}

class QuickSort implements Sortable {
    public int[] sortable(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class MergeSort implements Sortable {
    public int[] sortable(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

public class SortDemo {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        arr = bs.sortable(arr);
        System.out.println("Bubble Sorted Array");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        QuickSort qs = new QuickSort();
        int[] arr1 = { 15, 58, 96, 45, 11, 3, 5, 4 };
        arr1 = qs.sortable(arr1);
        System.out.println("Quick Sorted Array");
        for (int i = 0; i < arr1.length; i++)
            System.out.println(arr1[i]);

        MergeSort ms = new MergeSort();
        int[] arr2 = { 78, 89, 55, 22, 44, 663, 445, 89, 1, 5, 0 };
        arr2 = ms.sortable(arr2);
        System.out.println("Merge Sorted Array");
        for (int i = 0; i < arr2.length; i++)
            System.out.println(arr2[i]);

    }
}