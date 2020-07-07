package ayrikyapilar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/*
in this HomeWork we were asked to prove : 
Mihăilescu's theorem 
which means that there is no consecutively perfect power but 9 and 8

in this program finds a consecutive positive integers not exceeding a predefined number that are perfect powers. 
how the program works : 

         1- getting the boundary from the user 
         2- looping to get the perfect power of the
            numbers from 1 till the root of the boundary
         3- checking if the is smaller or greater thean it .
         4- checking if the arraylist contain the number 
         5- add it to the array list 
         6- sort arraylist
         7- print the arraylist out
         8- check if the numbers are consecutive by using the method of 
            x and y are consecutive if x+1=y .
         */


*/
/**
 * 
 * @author abdurrahman Rajab
 */
public class abdurrahmanRajabPerfectPower {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        

        // using the array list to save the perfect powers 
        ArrayList perfectPowerList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("write the predefined number , or the boundary ");
        int boundary = sc.nextInt();
        // pow = power its the result of the perfect power of the number .
        int pow;

        // the base number , where to start 
        // to short cut the loop , it cant be more than the number multiply it self.
        for (int i = 1; i <= Math.sqrt(boundary); i++) {
            //    the power of the number , so it will be i^j 
            for (int j = 2; j <= Math.sqrt(boundary); j++) {
                // getting the power of the number 
                // power method results is a double , thats why i have to cast it down
                pow = (int) Math.pow(i, j);
                // check it for our specific number .
                if (pow <= boundary) {
                    // check if we have added that power to our array before ,
                    // so we dont have any dublicated number 
                    if (!perfectPowerList.contains(pow)) {
                        // if not dublicated we add it to our list , 

                        perfectPowerList.add(pow);
                    }
                    // test code to check the power.
                    //  System.out.print(pow + " ");

                }
            }
            // test code , to got a line 
            //System.out.println(" ");
        }
        // sorting the power list to compare it easily .
        Collections.sort(perfectPowerList);
        // printing our perfect power list to check it 
        System.out.println(perfectPowerList);
        System.out.println("----");
        // comparing the numbers in the list if they are consecutive , by checking all the list .
        for (int i = 0; i < perfectPowerList.size() - 1; i++) {
            if (((int) (perfectPowerList.get(i))) + 1 == (int) perfectPowerList.get(i + 1)) {
                System.out.println(perfectPowerList.get(i) + " " + perfectPowerList.get(i + 1));
            }

        }
    }

}
