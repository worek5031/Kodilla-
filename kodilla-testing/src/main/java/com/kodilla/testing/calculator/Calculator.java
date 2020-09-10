package com.kodilla.testing.calculator;

public class Calculator {
   private int A;
   private int B;

   public Calculator(int A, int B) {
       this.A = A;
       this.B = B;
   }

   public int addAtoB() {
       return this.A + this.B;
   }

   public int substractBfromA() {
       return this.A - this.B;
   }
}
