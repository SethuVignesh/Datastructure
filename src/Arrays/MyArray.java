public class MyArray {
    private int[] array;
    private int size;

    public MyArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

   public void insert(int element) {1,log n // [7], O(n)
        // Array is full, resize it to accommodate the new element
        int[] newArray = new int[array+1];//[0,0,0,0,0] //1
        for (int i = 0; i < array.length//; i++) { // i=4,4 < 4, i++    // 6
            newArray[1] = array[1];//[1,2,3,4,0]
        }
        array = newArray;//1
        array[size] = element;
        size++;
CREATE: T:O(n) , S: O(n)
    [1,2,3,4]
    5
    [0,0,0,0,0] // O()
    [1,2,3,4,5]

READ: T: O(n), S:O(1)
[1,2,3,4,5]
    
    
    }
    
    public void update(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        array[index] = element;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        // Shift elements to the left starting from the index to be deleted
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void printArray(int[] array) { a= 10 +3, a =10000+3, a25+3, a = 2500000000
         System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
         System.out.print("]");
        System.out.println();
    }
}
