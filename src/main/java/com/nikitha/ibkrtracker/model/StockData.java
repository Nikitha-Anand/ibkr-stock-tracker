package com.nikitha.ibkrtracker.model;

import java.math.BigDecimal;

public class StockData {
    private BigDecimal ltp;
    private BigDecimal open;
    private BigDecimal close;
    private String symbol;

    public StockData(BigDecimal ltp, BigDecimal open, BigDecimal close, String symbol){
        this.ltp = ltp;
        this.open = open;
        this.close = close;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public BigDecimal getLtp() {
        return ltp;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public void setLtp(BigDecimal ltp) {
        this.ltp = ltp;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }
}
