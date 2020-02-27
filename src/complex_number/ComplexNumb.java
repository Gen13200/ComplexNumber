package complex_number;

public class ComplexNumb {
    double re;
    double im;

    public  ComplexNumb(){

    }

    public ComplexNumb(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return "ComplexNumb = " + re + " + i*" + im;
    }

    public ComplexNumb sumComplexNumb(ComplexNumb a, ComplexNumb b) {
        ComplexNumb numb = new ComplexNumb();
        numb.setRe(a.getRe() + b.getRe());
        numb.setIm(a.getIm() + b.getIm());
        return numb;
    }

    public ComplexNumb difComplexNumb(ComplexNumb a, ComplexNumb b) {
        ComplexNumb numb = new ComplexNumb();
        numb.setRe(a.getRe() - b.getRe());
        numb.setIm(a.getIm() - b.getIm());
        return numb;
    }

    public ComplexNumb multiComplexNumb(ComplexNumb a, ComplexNumb b) {
        ComplexNumb numb = new ComplexNumb();
        numb.setRe(a.getRe() * b.getRe() - a.getIm() * b.getIm());
        numb.setIm(a.getRe() * b.getIm() + a.getIm() * b.getRe());
        return numb;
    }

    public ComplexNumb divComplexNumb(ComplexNumb a, ComplexNumb b) {
        ComplexNumb numb = new ComplexNumb();
        numb.setRe((a.getRe() * b.getRe() + a.getIm() * b.getIm()) / (b.getIm() * b.getIm() + b.getRe() * b.getRe()));
        numb.setIm((a.getIm() * b.getRe() - a.getRe() * b.getIm()) / (b.getIm() * b.getIm() + b.getRe() * b.getRe()));
        return numb;
    }

    public double absComplexNumb(ComplexNumb a){
        double abs = Math.sqrt(a.getRe()*a.getRe() + a.getIm()*a.getIm());
        return abs;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ComplexNumb && this.getRe() == ((ComplexNumb) o).getRe() && this.getIm() == ((ComplexNumb) o).getIm()) {
            return true;
        } else return  false;
     }

}
