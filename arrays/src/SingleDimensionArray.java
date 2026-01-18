public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int arraySize) {
        arr = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int element) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = element;
                System.out.println("Element inserted successfully");
            } else {
                System.out.println("Element at " + location + "th position already exist. cannot override.");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array index out of bound.");
        }
    }

    public void traversal() {
        for(int i=0; i<arr.length; i++) {
            try {
                System.out.print(arr[i] + " ");
            } catch (Exception exception) {
                System.out.println("Array not exist");
            }
        }
    }

    public void search(int element) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == element) {
                System.out.println("Element found at position "+ i);
                return;
            }
        }
        System.out.println("Element not found in given array.");
    }

    public void deleteElementAtIndex(int indexTobeDeleted) {
        try {
            arr[indexTobeDeleted] = Integer.MIN_VALUE;
            System.out.println("Element at index "+indexTobeDeleted +" is deleted successfully.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index to be deleted is not in the range of array");
        }
    }
}
