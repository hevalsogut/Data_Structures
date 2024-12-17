public class DynamicArray {
  int size;
  int capacity = 10;
  Object[] array;

  public DynamicArray() {
    this.array = new Object[capacity];
  }

  /* If the user want to change the capacity */
  public DynamicArray(int capacity) {
    this.capacity = capacity;
    this.array = new Object[capacity];
  }

  /* Add method */
  public void add(Object data) {
    if (size >= capacity) {
      grow();
    }
    array[size] = data;
    size++;
  }

  public void insert(int index, Object data) {
    if (size >= capacity) {
      grow();
    }
    for (int i = size; i > index; i--) {
      array[i] = array[i - 1];
    }
    array[index] = data;
    size++;
  }

  public void delete(Object data) {
    for (int i = 0; i < size; i++) {
      if (array[i] == data) {
        for (int j = 0; j < (size - 1 - i); j++) {
          array[i + j] = array[i + j + 1];
        }
        array[size - 1] = null;
        size--;
        if (size <= (int) (capacity / 3)) {
          shrink();
        }
        break;
      }
    }
  }

  public int search(Object data) {
    for (int i = 0; i < size; i++) {
      if (array[i] == data) {
        return i;
      }
    }

    return -1;
  }

  private void grow() {
    int newCapacity = (int) (capacity * 2);

    Object[] newArray = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    capacity = newCapacity;
    array = newArray;
  }

  private void shrink() {
    int newCapacity = (int) (capacity / 2);

    Object[] newArray = new Object[newCapacity];

    for (int i = 0; i < size; i++) {
      newArray[i] = array[i];
    }
    capacity = newCapacity;
    array = newArray;

  }

  /* If the array is empty return a boolean value */
  public boolean isEmpty() {
    return size == 0;
  }

  /* toString Method for displaying the array */
  public String toString() {
    String string = "";
    for (int i = 0; i < capacity; i++) {
      string += array[i] + ", ";
    }
    if (string != "") {
      string = "[" + string.substring(0, string.length() - 2) + "]";
    } else {
      string = "[]";
    }
    return string;
  }

}
