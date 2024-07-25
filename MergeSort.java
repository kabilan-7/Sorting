package sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    List<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n=arr.length;
        mergesort(arr,0,n);
        for (int i:arr){
            System.out.println(i);
        }

    }
    static void mergesort(int arr[],int low,int high){
        if(high-low==1) return;
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr, mid,high);
        merge(arr,low,mid,high);

    }
   static void merge(int arr[],int low,int mid,int high){
         int newarr[]=new int[high-low];
        int left=low;
        int right=mid;
        int k=0;
        while(left<mid && right<high){
            if(arr[left]<=arr[right]){
                newarr[k]=arr[left];
                left++;
            }else {
                newarr[k]=arr[right];
                right++;
            }
            k++;
        }
        while(left<mid){
            newarr[k]=arr[left];
            left++;
            k++;
        }
        while (right<high){
            newarr[k]=arr[right];
            right++;
            k++;
        }
        for(int l=0;l<newarr.length;l++){
            arr[low+l]=newarr[l];
        }
   }
}
