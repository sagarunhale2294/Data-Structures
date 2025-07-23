package com.cts.search;

class DeleteNthPositionElement {
  
    public static void deleteElement(int arr[], int position) {
      for(int i = position; i < arr.length-1; i++) {
        arr[i] = arr[i+1];
      }
      for (int i=0; i<arr.length-1; i++) {
        System.out.println(arr[i]);
      }
    }
  
    public static void main(String[] args) {
      int array[] = {1,2,3,4,5};
      int position = 2;
      
      DeleteNthPositionElement.deleteElement(array, position);
    }
}
