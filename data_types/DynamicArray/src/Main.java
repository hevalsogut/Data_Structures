public class Main {
  public static void main(String[] args) {

    DynamicArray dynamicArray = new DynamicArray(5);

    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");
    dynamicArray.add("D");
    dynamicArray.add("E");
    dynamicArray.add("F");

    dynamicArray.delete("A");
    dynamicArray.delete("B");
    dynamicArray.delete("C");

    // dynamicArray.insert(0, "Z");
    // dynamicArray.delete("A");
    // System.out.println("The index of the data : " + dynamicArray.search("C"));

    System.out.println("Size : " + dynamicArray.size);
    System.out.println("Capacity : " + dynamicArray.capacity);
    System.out.println(dynamicArray);
    System.out.println("Dynamic Array is Empty: " + dynamicArray.isEmpty());

  }
}
