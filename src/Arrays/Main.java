public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
        myArray.insert(1);
        myArray.insert(2);
        myArray.insert(3);
        myArray.insert(4);
        myArray.insert(5);

        myArray.delete(2); // Delete element at index 2

        myArray.printArray(); // Print the array
    }
}
