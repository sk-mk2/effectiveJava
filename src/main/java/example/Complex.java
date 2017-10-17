//不変クラスの例
package example;

public final class Complex {
    private final double re;
    private final double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    
    public double realPart() { return re; }
    public double imaginaryPart() {return im; }

    public Complex add(Complex c) {
        return new Complex(re + c.re,im +c.im); 
    }
    
    public Complex subtract(Complex c) {
        return new Complex(1,1);
    }
    public Complex multiply(Complex c) {
        return new Complex(1,1);
    }
    public Complex divide(Complex c) {
        return new Complex(1,1);
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof Complex)) {
            return false;
        }
        Complex c = (Complex) o;

        return 0 == Double.compare(re, c.re) && 0 == Double.compare(im, c.im);
    }

    @Override
    public int hashCode() {
        int result = 17 + hashDouble(re);
        result = 31 * result + hashDouble(im);
        return result;
    }

    private static int hashDouble(double val) {
        long longBits = Double.doubleToLongBits(val);
        return (int) (longBits ^ (longBits >>> 32));
    }
    
    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
