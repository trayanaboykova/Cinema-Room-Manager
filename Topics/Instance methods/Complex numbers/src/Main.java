class Complex {

    double real;
    double image;

    // Adds the given complex number to this one
    public void add(Complex num) {
        this.real  += num.real;
        this.image += num.image;
    }

    // Subtracts the given complex number from this one
    public void subtract(Complex num) {
        this.real  -= num.real;
        this.image -= num.image;
    }
}
