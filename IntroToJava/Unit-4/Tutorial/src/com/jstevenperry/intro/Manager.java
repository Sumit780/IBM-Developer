package com.jstevenperry.intro;

public class Manager implements StockOptionEligible, BonusEligible {

    public Manager() {
    }

    public void processStockOptions (int numberOfOptions, BigDecimal price) {
      log.info("I can't believe I got " + number + " options at $" + price.toPlainString() + " each!"); 
    }
}