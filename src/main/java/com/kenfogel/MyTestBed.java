//package com.kenfogel;
//
//import java.util.concurrent.TimeUnit;
//import org.openjdk.jmh.annotations.Benchmark;
//import org.openjdk.jmh.annotations.BenchmarkMode;
//import org.openjdk.jmh.annotations.Fork;
//import org.openjdk.jmh.annotations.Measurement;
//import org.openjdk.jmh.annotations.Mode;
//import org.openjdk.jmh.annotations.OutputTimeUnit;
//import org.openjdk.jmh.annotations.Warmup;
//
//@BenchmarkMode(Mode.AverageTime)
//@OutputTimeUnit(TimeUnit.NANOSECONDS)
//public class MyTestBed {
//
//    @Benchmark
//    @Fork(value = 2)
//    @Measurement(iterations = 5, time = 2)
//    @Warmup(iterations = 5, time = 2)
//    public int deadCode() {
//        int a = 6, b = 7;
//        int c = a + b;
//        return c;
//    }
//}
