
public class OneDimensionArrayTest {
    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(10);
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(1, 5);
        singleDimensionArray.insert(12, 4);

        System.out.println("traversal");
        singleDimensionArray.traversal();

        System.out.println("Find an element");
        singleDimensionArray.search(3);
        singleDimensionArray.search(10);
        singleDimensionArray.search(-2147483648);

        System.out.println("Delete an element in array");
        singleDimensionArray.deleteElementAtIndex(0);
        singleDimensionArray.traversal();
    }
}
