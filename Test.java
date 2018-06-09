public class Test {
    public static void main(String[] args) {
        testMinandMax();
        testLocalMinAndMax();
        testSquareArray();
        testRectangleArray();
    }
    public static void testMinandMax() {
        int[][] array;
        array = MultidimensionalArrays.createDoubleDimArray(6, 5, 100,-100);
        System.out.println("---------------Test Max and Mix--------------");
        MultidimensionalArrays.printArray(array);
        System.out.println("-----------------------------");
        System.out.println("mas = " + MultidimensionalArrays.findMax(array));
        System.out.println("min = " + MultidimensionalArrays.findMin(array));
    }
    public static void testLocalMinAndMax(){
        int[][] array;
        array = MultidimensionalArrays.createDoubleDimArray(4, 3, 100,0);
        System.out.println("---------------Test Local Min and Mix--------------");
        MultidimensionalArrays.printArray(array);
        System.out.println("-----------------------------");
        MultidimensionalArrays.findLocalMax(array);
        MultidimensionalArrays.findLocalMin(array);
    }
    public static void testSquareArray() {
        int[][] array;
        array = MultidimensionalArrays.createDoubleDimArray(5, 5, 50,-50);
        System.out.println("---------------Test transpose square array --------------");
        MultidimensionalArrays.printArray(array);
        System.out.println("-----------------------------");
        array = MultidimensionalArrays.transposeArray(array);
        MultidimensionalArrays.printArray(array);
    }
    public static void testRectangleArray() {
        int[][] array;
        array = MultidimensionalArrays.createDoubleDimArray(4, 3, 50,-50);
        System.out.println("---------------Test transpose rectangle array --------------");
        MultidimensionalArrays.printArray(array);
        System.out.println("-----------------------------");
        array = MultidimensionalArrays.transposeArray(array);
        MultidimensionalArrays.printArray(array);
    }
}