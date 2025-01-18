public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            //This is an example of a case that can cause the code to exit unexpectedly
            // if (i == 5) {
            //     break; // Exit the loop when i is 5
            // }
        }
        System.out.println("Loop finished");
    }
}