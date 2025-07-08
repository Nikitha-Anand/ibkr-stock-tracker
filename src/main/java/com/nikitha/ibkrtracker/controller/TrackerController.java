package com.nikitha.ibkrtracker.controller;

import com.nikitha.ibkrtracker.model.StockData;
import com.nikitha.ibkrtracker.service.TrackerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TrackerController {

    private final TrackerService trackerService;

    public TrackerController(TrackerService trackerService) {
        this.trackerService = trackerService;
    }

    @GetMapping
    public String getHello() {
        return "Hello, it is working!";
    }

    @GetMapping("/stocks/{symbol}")
    public StockData getStockPrice(@PathVariable String symbol) throws Exception {
        return trackerService.getStockDataBySymbol(symbol);
    }
}

