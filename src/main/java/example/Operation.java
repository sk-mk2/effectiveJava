package example;

public enum Operation {
    PLUS("+") { double apply(double x, double y) {return x + y;} },
    MINUS("-") { double apply(double x, double y) {return x - y;} },
    TIMES("*") { double apply(double x, double y) {return x * y;} },
    DIVIDE("/") { double apply(double x, double y) {return x / y;} };

    private final String symbol;
    
    Operation(String symbol) {
        this.symbol = symbol;
    }

    abstract double apply(double x, double y);
}
