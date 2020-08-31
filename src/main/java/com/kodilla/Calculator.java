package com.kodilla;

class Calculator {
    public static void main(String[] args) {
    }

    Calculation calculator = new Calculation();
    int suma = calculator.getSum(4, 6);


   System.out.println(suma);
}

}
class Calculation {
    public int getSum(int A, int B) {
        return A + B;
    }
}



