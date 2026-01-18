public class TwoDimensionalArray {

    int arr[][] = null;

    public TwoDimensionalArray(int row, int column) {
        arr = new int[row][column];
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int rowIndex, int columnIndex, int element) {
        try {
            if(arr[rowIndex][columnIndex] == Integer.MIN_VALUE) {
                arr[rowIndex][columnIndex] = element;
                System.out.println("Element successfully inserted at given position.");
            } else {
                System.out.println("Array position already occupied.");
            }
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Array indexes are not in range.");
        }
    }

    public void accessCell(int rowIndex, int columnIndex) {
        try {
            System.out.println("Element at position having rowIndex as " + rowIndex
                    + " and columnIndex as " + columnIndex + " is " + arr[rowIndex][columnIndex]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Indexes not in range.");
        }
    }

    public void traverseArray() {
        for(int row=0; row< arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void searchElement(int value) {
        for(int row=0; row< arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                if(arr[row][col] == value) {
                    System.out.println("Element found at row: "+row+" and column: "+col);
                    return;
                }
            }
        }
        System.out.println("Element not found at given array.");
    }

    public void deleteElement(int row, int col) {
        try {
            System.out.println("Successfully delete element: " + arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Indexes are not in range.");
        }
    }
}
