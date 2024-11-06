import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) throws Exception {

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                result.add("Fizz");
            }
            if (i % 5 == 0) {
                result.add("Buzz");
            }
            if (result.size() == 0) {
                result.add(String.valueOf(i));
            }

            System.out.println(String.join("", result));

            result.clear();
        }
    }
}
