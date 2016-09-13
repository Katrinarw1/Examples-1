/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class Methods {
    
    public double CircleArea(double radius){
        double answer = Math.PI*radius*radius;
        return answer;
        // stub to get rid of the error - have to remember to change later
        // return 0.0;
    }
    public int fib(int n){
        if(n == 0 || n == 1){ // base case (something you already know the answer to)(so you dont end up with an infinate loop)
            return 1;
        }
        return fib(n-1) + fib(n-2); // recursive bit (calls on it self)
    }
    
    public int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*fact(n-1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Methods test = new Methods();
        double area = test.CircleArea(3);
        System.out.println("Area " + area);
        System.out.println(test.fib(10));   // doesnt work well - works better with a loop
        System.out.println(test.fact(11));  // ^^
    }
}
