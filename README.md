# ComplexNumber

⦁	Design a class ComplexNo that allows you to add, subtract, multiply and divide two complex numbers. Recall that a complex number is: a + bi, where a, b are real numbers and i =√-1. Note: to divide 2 complex numbers: (a + bi / c + di), multiply the fraction by 1 in the form of (c – di / c – di). The numbers c – di and c + di are called conjugates because their product is always c2 + d2, with no imaginary part.
Provide (in addition to add, subtract, multiply, and divide methods) a method for equals (which returns boolean), and toString( ) method (that returns a string representing the receiving object). If an attempt is made to divide by 0 (0 + 0i) display an error message and exit. Your implementation should return the results of each operation WITHOUT changing the operands.
Prompt the user for two imaginary numbers, a + bi and c + di, then compute: the sum of the two, the first minus the second, the product of the two, and the first divided by the second. Sample outputs: 

Enter the first complex number's real part => 1.0
Enter the first complex number's imaginary part => -1.0
Enter the second complex number's real part => -1.0
Enter the second complex number's imaginary part => 1.0
complex number 1: 1.000000 - 1.000000i
complex number 2: -1.000000 + 1.000000i
the numbers are equal? false
add result: 0.000000
subtract result: 2.000000 - 2.000000i
multiply result: 2.000000i
divide result: -1.000000

Enter the first complex number's real part => 1.0
Enter the first complex number's imaginary part => 1.0
Enter the second complex number's real part => 0.0
Enter the second complex number's imaginary part => 0.0
complex number 1: 1.000000 + 1.000000i
complex number 2: 0.000000
the numbers are equal? false
add result: 1.000000 + 1.000000i
subtract result: 1.000000 + 1.000000i
multiply result: 0.000000
cannot divide by 0
