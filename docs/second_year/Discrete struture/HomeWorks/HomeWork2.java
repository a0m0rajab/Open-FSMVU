import java.util.Collections;

/**
 *
 * @author abdurrahman Rajab 
 *
 */
 
 /*
 A program that check if the relation is 
  1- Onto 
  2- One-to-One
  3- Bijection 
  4-  get its inverse if it has .
  */ 
public class HomeWork2 {

    public static void main(String[] args) {
        // <editor-fold defaultstate="collapsed" desc="power function : x^3 from -2 till 2 , the Codomain -8 to 8">
        int[][] function1 = PowerFunction(-2, 2, 3);
        printAllMethods(function1, "the power function x^3", -8, 8);

        //  </editor-fold >
        //         <editor-fold defaultstate="collapsed" desc="Absolute Function |x|  from -2 till 2 , codomain 0 to 2">
        int[][] functionAbsolute = AbsoluteFunction(-2, 2);
        printAllMethods(functionAbsolute, "the absolute function |x|", 0, 2);
        // </editor-fold>
        //         <editor-fold defaultstate="collapsed" desc="increasing fucntion x+1  from -2 till 2 , codomain -1 to 3" >
        int[][] arithmeticFunction = ArithmeticFunction(-2, 2);
        printAllMethods(arithmeticFunction, "arithemtict function x+1", -1, 3);
        // </editor-fold>
    }

    public static void printAllMethods(int[][] function, String message, int codomainStart, int codomainEnd) {
        // <editor-fold defaultstate="collapsed" desc="get the Codomain set" >

        System.out.println("The Codomain of the function : ");
        int boundary = codomainEnd - codomainStart + 1;
        int tempStart = codomainStart;
        int[] theCodomain = new int[boundary];
        for (int i = 0; i < boundary; i++) {
            theCodomain[i] = tempStart;
            System.out.print(tempStart + " ");
            tempStart++;
        }
        System.out.println("");
        // </editor-fold>
        printFuntion(function, message);
        System.out.println("one to one test : " + OneToOne(function, theCodomain));
        System.out.println("on To test      : " + onTo(function, theCodomain));
        boolean bijection = bijection(function, theCodomain);
        System.out.println("bijection test  : " + bijection);
        // the inverse test .
        if (bijection) {
            printFuntion(inverse(function), "inverse of  " + message);
        } else {
            System.out.println("We cant inverse it because its not bijection ");
        }

    }

    public static boolean bijection(int[][] relation, int[] codomainSet) {
        if (onTo(relation, codomainSet) && OneToOne(relation, codomainSet)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean OneToOne(int[][] function, int[] codomainSet) { // to check 
        // function [loop][0] The preimage
        // function [loop][1] The image


        int counter;
        for (int i = 0; i < codomainSet.length; i++) {
            counter = 0;
            for (int j = 0; j < function.length; j++) {
                if (codomainSet[i] == function[j][1]) {
                    counter++;
                    // if the codain set had more than one preimage then its not oneToOne
                    if (counter >= 2) {
                        return false;
                    }
                }
            }
        }
        return true;


    }

 // it could use the function only without the other set... to change later .
    public static boolean onTo(int[][] function, int[] codomainSet) { // to check 
        // function [loop][0] The Domain
        // function [loop][1] The CoDomain
        int counter = 0;
        for (int i = 0; i < codomainSet.length; i++) {

            for (int j = 0; j < function.length; j++) {
                if (codomainSet[i] == function[j][1]) {
                    counter++;
                    break;

                }
            }
        }
        // if the cooain set has been all taken this its OnTo
        if (counter == codomainSet.length) {
//            System.err.println(counter);
            return true;
        } else {
            return false;
        }

    }

    public static int[][] inverse(int[][] function) {
        // function [loop][0] The Domain
        // function [loop][1] The CoDomain
        int result[][] = new int[function.length][2];
        for (int i = 0; i < function.length; i++) {
            result[i][1] = function[i][0];
//            System.out.print(aray[i][0] +" ");
        }
//        System.out.println("");
        for (int i = 0; i < function.length; i++) {
            result[i][0] = function[i][1];
//            System.out.print(aray[i][1] + " ");
        }

        return result;
    }

    public static int[][] PowerFunction(int startFrom, int till, int power) {
        int LoopTime = till - startFrom;
        int[][] aray = new int[LoopTime + 1][2];

        for (int i = 0; i <= LoopTime; i++) {
            aray[i][0] = startFrom++;
//            System.out.print(aray[i][0] +" ");
        }
//        System.out.println("");
        for (int i = 0; i <= LoopTime; i++) {
            aray[i][1] = (int) Math.pow(aray[i][0], power);
//            System.out.print(aray[i][1] + " ");
        }

        return aray;
    }

    public static int[][] ArithmeticFunction(int startFrom, int till) {
        int LoopTime = till - startFrom;
        int[][] aray = new int[LoopTime + 1][2];

        for (int i = 0; i <= LoopTime; i++) {
            aray[i][0] = startFrom++;
//            System.out.print(aray[i][0] +" ");
        }
//        System.out.println("");
        for (int i = 0; i <= LoopTime; i++) {
            aray[i][1] = aray[i][0] + 1;
//            System.out.print(aray[i][1] + " ");
        }

        return aray;
    }

    public static int[][] AbsoluteFunction(int startFrom, int till) {
        int LoopTime = till - startFrom;
        int[][] aray = new int[LoopTime + 1][2];

        for (int i = 0; i <= LoopTime; i++) {
            aray[i][0] = startFrom++;
//            System.out.print(aray[i][0] +" ");
        }
//        System.out.println("");
        for (int i = 0; i <= LoopTime; i++) {
            aray[i][1] = Math.abs(aray[i][0]);
//            System.out.print(aray[i][1] + " ");

        }
        return aray;

    }

    public static void printFuntion(int function[][], String message) {
        System.out.println(message);
        for (int i = 0; i < function.length; i++) {
            System.out.print("x= ");
            for (int j = 0; j < 2; j++) {
                if (j == 1) {
                    System.out.print(", y = ");
                }
                System.out.print(function[i][j]);
            }

            System.out.println("");
        }
        System.out.println("The End ");

    }

}
