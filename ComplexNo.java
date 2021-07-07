

class ComplexNo {

    // Create double variables for the real and imaginary parts
    double real, imaginary;

    // Create default constructor
    public ComplexNo() {
        real = 0;
        imaginary = 0;
    }

    // Create parameterized constructor
    public ComplexNo(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Create method to detect if numbers are the same
    public boolean equals(ComplexNo that) {

        boolean isEqual;

        if ((this.real == that.real) && (this.real == that.real)) {
            isEqual = true;
        }
        else {
            isEqual = false;
        }

        return isEqual;
    }



    // Create method to add the complex numbers
    public ComplexNo add(ComplexNo that) {
        ComplexNo complexNo = new ComplexNo();

        // Add to get real and imaginary numbers
        complexNo.real = this.real + that.real;
        complexNo.imaginary = this.imaginary + that.imaginary;
        return complexNo;
    }

    // Create method to subtract the complex numbers
    public ComplexNo subtract(ComplexNo that) {
        ComplexNo complexNo = new ComplexNo();

        // Subtract to get real and imaginary numbers
        complexNo.real = this.real - that.real;
        complexNo.imaginary = this.imaginary - that.imaginary;
        return complexNo;
    }

    // Create method to multiply the complex numbers
    public ComplexNo multiply(ComplexNo that) {
        ComplexNo complexNo = new ComplexNo();

        // Multiply to get real and imaginary numbers
        complexNo.real = (this.real * that.real) - (this.imaginary * that.imaginary);
        complexNo.imaginary = (this.real * that.imaginary) + (this.imaginary * that.real);
        return complexNo;
    }

    // Create method to divide the complex numbers
    public ComplexNo divide(ComplexNo that) throws Exception {
        ComplexNo complexNo = new ComplexNo();

        if ((that.real == 0) && (that.imaginary == 0)) {
            throw new Exception();
        }

        try {

            // Multiply the fraction by 1 in the form of (c – di / c – di) with conjugates on the fraction bottom
            // Do (ac+bd)/(c^2+d^2)
            complexNo.real = ((this.real * that.real) + (this.imaginary * that.imaginary)) / (Math.pow(that.real, 2) + Math.pow(that.imaginary, 2));
            complexNo.imaginary = ((this.imaginary * that.real) - (this.real * that.imaginary)) / (Math.pow(that.real, 2) + Math.pow(that.imaginary, 2));

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return complexNo;

    }


    // Create toString method that returns a string representing the receiving object
    public String toString() {

        return String.format("%f + %fi", real, imaginary);
    }



}