/**
 * @(#)P2Q1.java
 *
 *
 * @author 
 * @version 1.00 2020/6/25
 */

public class P2Q1 {

    public static void main(String []args){
    	System.out.printf("Number%3sSquareRoot\n", "");
        for (int i = 0; i <= 20; i+=2) {
            System.out.printf("%-9d%.4f\n",i,Math.sqrt(i));
        }
    }
    
}