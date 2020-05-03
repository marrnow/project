package com.example.bitcoin.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class THB {
    @JsonProperty("15m")
    private double m;
    @JsonProperty("last")
    private double last;
    @JsonProperty("buy")
    private double buy;
    @JsonProperty("sell")
    private double sell;
    @JsonProperty("symbol")
    private String symbol;

    @Override
    public String toString() {
        return "THB{" +
                "m=" + m +
                ", last=" + last +
                ", buy=" + buy +
                ", sell=" + sell +
                ", symbol='" + symbol + '\'' +
                '}';
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getLast() {
        return last;
    }

    public void setLast(double last) {
        this.last = last;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSell() {
        return sell;
    }

    public void setSell(double sell) {
        this.sell = sell;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

