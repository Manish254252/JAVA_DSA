public class exception {

    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        int k = 0;

        try {
            k = a / b;
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Some error");
    }

}
