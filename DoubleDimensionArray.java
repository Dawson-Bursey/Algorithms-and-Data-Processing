public class DoubleDimensionArray {
    private int[][] array;
    private int cols;
    private int rows;

    public DoubleDimensionArray(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        array = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = -1;
            }
        }
    }


    public void insert(int row, int col, int value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols){
            if (array[row][col] == -1){
                array[row][col] = value;
                System.out.println("inserted " + value + " at " + row + ", " + col);
            } else {
                System.out.println("position " + row + ", " + col + "is already occupied ");
            }
        } else {
            System.out.println("Invalid position ");

            }
        }

    public void traverse() {
        System.out.println("Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void search(int value) {
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == value) {
                    System.out.println("Value found at position " + i + ", " + j);
                    return;
                }
            }
        }
        if (!found){
            System.out.println("Value not found");
        }
    }

    public void delete(int row, int col) {
        if (row >= 0 && row < rows && col >= 0 && col < cols){
            if (array[row][col] != -1){
                array[row][col] = -1;
                System.out.println("Deleted value at position " + row + ", " + col);
            } else {
                System.out.println("No value at position " + row + ", " + col);
            }
        } else {
            System.out.println("Invalid position ");
        }
    }

    public static void main(String[] args){
        DoubleDimensionArray array = new DoubleDimensionArray(3, 3);
        array.traverse();
        array.insert(0, 0, 1);
        array.insert(0, 1, 2);
        array.insert(0, 2, 3);
        array.insert(1, 0, 4);
        array.insert(1, 1, 5);
        array.insert(1, 2, 6);
        array.insert(2, 0, 7);
        array.insert(2, 1, 8);
        array.insert(2, 2, 9);
        array.traverse();
        array.search(5);
        array.search(10);
        array.delete(1, 1);
        array.delete(1, 1);
        array.traverse();
    }
}

