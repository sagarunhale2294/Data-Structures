import java.util.Arrays;

public class TwoDimensionArrayTest {

    public static void main(String[] args) {
        int twoDimArray[][] = new int[2][2];
        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        twoDimArray[1][0] = 3;
        twoDimArray[1][1] = 4;

        System.out.println(Arrays.deepToString(twoDimArray));

        char twoDimCharArray[][] = {{'a', 'b'}, {'c', 'd'}};
        System.out.println(Arrays.deepToString(twoDimCharArray));

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(2,3);
        twoDimensionalArray.insert(0,0, 1);
        twoDimensionalArray.insert(0,1,2);
        twoDimensionalArray.insert(0,0,3);
        twoDimensionalArray.insert(3,4,1);
        twoDimensionalArray.accessCell(0,0);
        twoDimensionalArray.traverseArray();
        twoDimensionalArray.searchElement(2);
        twoDimensionalArray.searchElement(3);

        System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
        twoDimensionalArray.deleteElement(0,1);
        System.out.println(Arrays.deepToString(twoDimensionalArray.arr));
    }
}
