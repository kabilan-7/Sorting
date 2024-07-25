package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        qs(arr,0,arr.length-1);
       for (int a:arr){
          System.out.println(a);
      }
    }
     static void qs(int[] arr, int low, int high){
        if(low>=high) return;
        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];

        while(start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                //swap
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        //now pivot is at correct position
        //sort the two halves
        qs(arr,low,end);
        qs(arr,start, high);

    }
}
