public class selectionSort {
    public  int [] SelectionSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
                // find index of smallest element
                int smallest = i;
                for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                smallest = j;
                }
                }
                swap(a, i, smallest); // swap smallest to front
                }
        return a;
               }

        public  void swap(int[] list, int i, int j) {
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
        }
   
}
