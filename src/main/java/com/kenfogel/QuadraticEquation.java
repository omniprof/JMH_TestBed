//package com.kenfogel;
//
//import java.util.concurrent.TimeUnit;
//import org.openjdk.jmh.annotations.Benchmark;
//import org.openjdk.jmh.annotations.BenchmarkMode;
//import org.openjdk.jmh.annotations.Fork;
//import org.openjdk.jmh.annotations.Measurement;
//import org.openjdk.jmh.annotations.Mode;
//import org.openjdk.jmh.annotations.OutputTimeUnit;
//import org.openjdk.jmh.annotations.Scope;
//import org.openjdk.jmh.annotations.State;
//import org.openjdk.jmh.annotations.Warmup;
//
//@BenchmarkMode(Mode.AverageTime)
//@OutputTimeUnit(TimeUnit.NANOSECONDS)
//public class QuadraticEquation {
//    
//    @State(Scope.Benchmark)
//    public static class StateValues {
//        double a = 1.0;
//        double b = 6.0;
//        double c = 8.0;
//        double r1 = 0.0;
//        double r2 = 0.0;
//    }
//
//    @Benchmark
//    @Fork(value = 1)
//    @Measurement(iterations = 3, time = 2)
//    @Warmup(iterations = 3, time = 2)
//    public void quadraticEquation(StateValues state) {
//
//        // Formula based on https://www.javatpoint.com/java-program-to-solve-quadratic-equation
//        double discriminate = state.b * state.b - 4.0 * state.a * state.c;
//        if (discriminate > 0.0) {
//            state.r1 = (-state.b + Math.pow(discriminate, 0.5)) / (2.0 * state.a);
//            state.r2 = (-state.b - Math.pow(discriminate, 0.5)) / (2.0 * state.a);
//            // System.out.println("The roots are " + state.r1 + " and " + state.r2);
//        } else if (discriminate == 0.0) {
//            state.r1 = -state.b / (2.0 * state.a);
//            // System.out.println("The root is " + state.r1);
//        } else {
//            // System.out.println("Roots are not real.");  
//        }
//    }
//
//    @Benchmark
//    @Fork(value = 1)
//    @Measurement(iterations = 3, time = 2)
//    @Warmup(iterations = 3, time = 2)
//    public void quadraticEquationNoState() {
//        double a = 1.0;
//        double b = 6.0;
//        double c = 8.0;
//        double r1 = 0.0;
//        double r2 = 0.0;
//
//        // Formula based on https://www.javatpoint.com/java-program-to-solve-quadratic-equation
//        double discriminate = b * b - 4.0 * a * c;
//        if (discriminate > 0.0) {
//            r1 = (-b + Math.pow(discriminate, 0.5)) / (2.0 * a);
//            r2 = (-b - Math.pow(discriminate, 0.5)) / (2.0 * a);
//            // System.out.println("The roots are " + r1 + " and " + r2);
//        } else if (discriminate == 0.0) {
//            r1 = -b / (2.0 * a);
//            // System.out.println("The root is " + r1);
//        } else {
//            // System.out.println("Roots are not real.");  
//        }
//    }
//
//}
