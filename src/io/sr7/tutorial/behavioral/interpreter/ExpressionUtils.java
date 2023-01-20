package io.sr7.tutorial.behavioral.interpreter;

public class ExpressionUtils {
 
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*");
    }
     
    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
            return new Add(left, right);
            case "-":
            return new Substract(left, right);
            case "*":
            return new Product(left, right);
        }
        return null;
    }
 
}