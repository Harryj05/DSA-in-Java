
public class MergeSort {

  private static void mergeSort(int[] arr, int l, int r) {
    if (l < r) {
      int mid = (l + r) / 2;

      mergeSort(arr, l, mid);
      mergeSort(arr, mid + 1, r);
      merge(arr, l, mid, r);
    }
  }

  private static void merge(int[] arr, int l, int mid, int r) {
    int n1 = mid - l + 1;
    int n2 = r - mid;

    int[] lArr = new int[n1];
    int[] rArr = new int[n2];

    for (int i = 0; i < n1; i++) {
      lArr[i] = arr[l + i];
    }

    for (int j = 0; j < n2; j++) {
      rArr[j] = arr[mid + 1 + j];
    }

    int i = 0, j = 0, k = l;

    while (i < n1 && j < n2) {
      if (lArr[i] <= rArr[j]) {
        arr[k] = lArr[i];
        i++;
      } else {
        arr[k] = rArr[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements of lArr[] if any
    while (i < n1) {
      arr[k] = lArr[i];
      i++;
      k++;
    }

    // Copy remaining elements of rArr[] if any
    while (j < n2) {
      arr[k] = rArr[j];
      j++;
      k++;
    }
  }

  public static void main(String[] args) {
    int arr[] = {3, 5, 1, 4, 6, 2};

    System.out.println("Before Sorting:");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

    mergeSort(arr, 0, arr.length - 1);

    System.out.println("After Sorting:");
    for (int n : arr) {
      System.out.print(n + " ");
    }
  }
}
