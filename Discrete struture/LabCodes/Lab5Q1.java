public class Question2 {

    public static void main(String[] args) {
        // displayResult(23, 33, 13);
//        System.out.println(" denklem 1 ");
//        displayResult(1, 7, 12);
//        sout denlklem 2 
//         displayResult(2, -8, -24);
//                  displayResult(1, -2, 1);
//                  displayResult(1, -5, 6);

    }

    public static void displayResult(int a, int b, int c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        double root1 = (-b + Math.sqrt(delta)) / 2 * a;
        double root2 = (-b - Math.sqrt(delta)) / 2 * a;
        if (delta < 0) {
            System.out.println("there is no real root ...");
        } else if (delta == 0) {

            System.out.println("the firs root = " + root1);

        } else {
            System.out.println(" there is 2 root");

            System.out.println("the firs root = " + root1);

            System.out.println("the second root = " + root2);
        }

    }
}
