public class Quicksort {//nlogn is best case and n^2 in worst case

  public static void quicksort(int[] arr, int low, int high){
    if(low<high)
    {
      int pi = partition(arr, low, high);
      quicksort(arr, low, pi-1);
      quicksort(arr, pi +1 , high);
    }
  }

  public static int partition(int[] arr, int low, int high){
    int pivot = arr[high];
    int i = low-1;
    for(int j = low; j< high; j++){
      if (arr[j]<pivot) {
        i++;
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;

      }
    }
    int temp = arr[i+1];
        arr[i+1]= arr[high];
        arr[high]=temp;

      return i+1;

  }


  public static void main(String[] args) {
    int arr[] = {5,6,2,3,1,8,4};
    int high = arr.length - 1;

    int low = 0;
    quicksort(arr, low, high);System.out.println("Sorted array:");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
  
}
