import java.util.Stack;

public class stack {
    public static void main(String[] args) throws Exception {
        // ***********************************************/
        // Stack: LIFO. Last In First Out
        // stores objects into a sort of "vertical tower"
        // push() - adds an element to the top of the stack
        // pop() - removes the top element from the stack
        // ***********************************************/
        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("BorderLand");
        stack.push("GTA V");
        // ***********************************************/
        // System.out.println(stack.peek());
        // String myFavgame = stack.pop();
        // System.out.println(myFavgame);
        // System.out.println(stack);
        // System.out.println(stack.search("Minecraft"));
        // ***********************************************/
    }
}
