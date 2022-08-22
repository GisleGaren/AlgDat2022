package algDat;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        // If the array is full, resize it
        // Add the new item at the end
        if(items.length == count){
            // Create new array (twice the size)
            // Copy all existing items
            // Set "items" to this new array
            int[] copy = new int[items.length*2];
            for(int i = 0; i < items.length; i++){
                 copy[i] = items[i];
            }
            items = copy;
        }
        items[count] = item;
        count++;
    }

    public void delete(int index){
        // Validate the index
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        // Shift the items to the left to fill the hole
        // Example array: [10, 20, 30, 40]
        // index: 1, 1 <- 2, 2 <- 3 etc...
        for(int i = index; i < count; i++){
            items[i] = items[i +1];
        }
        // We do count-- because when we call the print() method, we will then not print the last element in the array.
        count--;
    }

    public int indexOf(int item){
        // If we find the item, return the index
        // Otherwise, return -1
        for(int i = 0; i < count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
