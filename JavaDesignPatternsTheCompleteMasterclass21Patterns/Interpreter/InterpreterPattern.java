package Patterns.Interpreter;

public class InterpreterPattern {
  public InterpreterContext interpreterContext;

  public InterpreterPattern(InterpreterContext interpreterContext) {
    this.interpreterContext = interpreterContext;
  }

  public void runInterpreterPattern() {
    String first = "28 in Binary";
    String second = "28 in Hexadecimal";

    InterpreterPattern interpreter = new InterpreterPattern(new InterpreterContext());
    System.out.println(first+ " = " + interpreter.interpret(first));
    System.out.println(second+ " = " + interpreter.interpret(second));
  }

  public  String interpret(String str) {
    Expression expression = null;
    if (str.contains("Hexadecimal")) {
      expression = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
    }else if (str.contains("Binary")) {
      expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
    }else return str;
    return expression.interpreter(interpreterContext);
  }

}
