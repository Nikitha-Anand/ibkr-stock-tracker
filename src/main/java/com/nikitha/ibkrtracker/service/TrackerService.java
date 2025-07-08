package com.nikitha.ibkrtracker.service;

import com.nikitha.ibkrtracker.ibkr.IbkrDataProvider;
import com.nikitha.ibkrtracker.model.StockData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackerService {

    private final IbkrDataProvider ibkrDataProvider;

    @Autowired
    public TrackerService(IbkrDataProvider ibkrDataProvider) {
        this.ibkrDataProvider = ibkrDataProvider;
    }

    public StockData getStockDataBySymbol(String symbol) throws Exception {
        return ibkrDataProvider.getStockData(symbol);
    }
}

