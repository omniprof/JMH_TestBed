package com.kenfogel;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class MyTestBedDeadCode {

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 3, time = 2)
    @Warmup(iterations = 3, time = 2)
    public void deadCode() {
        int a = 6, b = 7;
        int c = a + b;
    }

    @State(Scope.Benchmark)
    public static class StateValues {
        public int a = 6;
        public int b = 7;
        public int c;
    }

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 3, time = 2)
    @Warmup(iterations = 3, time = 2)
    public void liveCode(StateValues state) {
        state.c = state.a + state.b;
    }

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 3, time = 2)
    @Warmup(iterations = 3, time = 2)
    public void someCode(StateValues state) {
        state.c = state.a;
    }

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 3, time = 2)
    @Warmup(iterations = 3, time = 2)
    public void noCode() {

    }
}
