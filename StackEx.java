import java.util.Stack;
class StackExample 
{
    public static void main(String[] args) 
    {
        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after pushes: " + stack);

        // Peek at the top element
        String topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Pop an element from the Stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Get the size of the Stack
        int size = stack.size();
        System.out.println("Size of Stack: " + size);

        // Search for an element in the Stack
        int position = stack.search("Banana");
        System.out.println("Position of 'Banana' in stack (1-based): " + position);

        System.out.println("Stack before clear: "+ stack);
        // Clear the Stack
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}