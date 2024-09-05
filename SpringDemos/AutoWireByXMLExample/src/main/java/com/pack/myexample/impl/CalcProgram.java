package com.pack.myexample.impl;

import com.pack.myexample.repo.Program;

public class CalcProgram implements Program {
    public CalcProgram() {
        System.out.println("CalculatorProgram constructor");
    }

    public void compile() {
        System.out.println("Compiling in CalculatorProgram");
    }
}
