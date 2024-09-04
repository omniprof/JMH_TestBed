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
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class DeadCode {

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 2, time = 2)
    @Warmup(iterations = 2, time = 2)
    public void a01_deadCode() {
        // Use local variables
        int a = 6, b = 7;
        int c = a + b;
    }

    @State(Scope.Benchmark) // Same instance for each test
//    @State(Scope.Thread) // New instance for each test
    public static class StateValues {
        public int a = 6;
        public int b = 7;
        public int c;
    }

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 2, time = 2)
    @Warmup(iterations = 2, time = 2)
    public void a02_deadCodeState(StateValues state) {
        // Assign values to the state object
        state.a = 6;
        state.b = 7;
        state.c = state.a + state.b;
    }

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 2, time = 2)
    @Warmup(iterations = 2, time = 2)
    public void a03_liveCode(StateValues state) {
        // Use the values assigned in the state object
        state.c = state.a + state.b;
    }

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 2, time = 2)
    @Warmup(iterations = 2, time = 2)
    public void a04_someCode(StateValues state) {
        // Use the values assigned in the state object
        // except c
        int c = state.a + state.b;
    }

    @Benchmark
    @Fork(value = 1)
    @Measurement(iterations = 2, time = 2)
    @Warmup(iterations = 2, time = 2)
    public void a05_noCode() {

    }
}
