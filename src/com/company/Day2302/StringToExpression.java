package com.company.Day2302;

public class StringToExpression {
    static StringBuilder operands = new StringBuilder();
    static StringBuilder operators = new StringBuilder();
    static int result;
    static String[] opr;
    static String[] opd;

    public static int stringToExpression(String s) {
      separateOperatorsAndOperands(s);
      firstPrioritet();
      secondPrioritet();
      return result;
    }

    public static void firstPrioritet() {
        StringBuilder output=new StringBuilder();
           opr = operators.toString().split(" ");
           opd = operands.toString().split(" ");
        for (int i = 0; i < opr.length; i++) {
            switch (opr[i]) {
                case "*": {
                    opd[i+1] = String.valueOf(Integer.parseInt(opd[i]) * Integer.parseInt(opd[i + 1]));
                    opd[i] = "_";
                    opr[i] = "";
                    break;
                }
                case "/": {
                    if( Integer.parseInt(opd[i + 1])==0){
                        System.out.println("Invalid input");
                        return;
                    }
                    opd[i+1] = String.valueOf(Integer.parseInt(opd[i]) / Integer.parseInt(opd[i + 1]));
                    opd[i] = "_";
                    opr[i] = "";
                }
            }
        }
    }

    public static void secondPrioritet() {
        int opdIndex=0;
        while (opd[opdIndex]=="_"){
            opdIndex++;
        }
        result=Integer.parseInt(opd[opdIndex]);
        for (int i = 0;i < opr.length; i++) {
            opdIndex=i;
            switch (opr[i]) {
                case "+":
                    while (opd[opdIndex+1]=="_"){
                        opdIndex++;
                    }
                    result += Integer.parseInt(opd[opdIndex+1]);
                    break;
                case "-":
                    while (opd[opdIndex+1]=="_"){
                        opdIndex++;
                    }
                    result -= Integer.parseInt(opd[opdIndex+1]);
            }
        }
    }

    public static void separateOperatorsAndOperands(String s) {
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '+':
                case '*':
                case '/':
                case '-':
                    operands.append(s.substring(start, i)).append(" ");
                    operators.append(s.charAt(i)).append(" ");
                    start = i + 1;
            }

        }
        operands.append(s.substring(start));
    }

    public static void main(String[] args) {
        System.out.println(stringToExpression("2*3*4/2*8"));

    }
}
