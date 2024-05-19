package lab2.task1;

public class Complex {
    private Integer real;
    private Integer imaginary;

    public Complex(Integer real, Integer imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
        this(0, 0);
    }

    public Complex(Complex complex) {
        real = complex.real;
        imaginary = complex.imaginary;
    }

    public Integer getReal() {
        return real;
    }

    public void setReal(Integer real) {
        this.real = real;
    }

    public Integer getImaginary() {
        return imaginary;
    }

    public void setImaginary(Integer imaginary) {
        this.imaginary = imaginary;
    }
    public void addWithComplex (Complex complex){
        real += complex.real;
        imaginary += complex.imaginary;
    }
    public void showNumber(){
        System.out.println(real + " + " + imaginary + "i");
    }
}
