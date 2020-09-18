package com.company.builder;

public class Qualquer {

    private int valorA;
    private int valorB;

    public Qualquer(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    private Qualquer(Builder builder) {
        this.valorA = builder.valorA;
        this.valorB = builder.valorB;
    }

    public static class Builder {

        private int valorA;
        private int valorB;

        public Builder valorA(int valorA) {
            this.valorA = valorA;
            return this;
        }

        public Builder valorB(int valorB) {
            this.valorB = valorB;
            return this;
        }

        public Qualquer build() {
            return new Qualquer(this);
        }

    }

    public String toString() {
        return "{valorA = " + valorA + ", valorB: " + valorB +"}";
    }

}
