package ru.yetanothercoder.tradingbook;

import java.math.BigDecimal;

/**
 * @author Mikhail Baturov | www.yetanothercoder.ru
 */
public class Quote<S> {
    public final BigDecimal bid, offer;
    public final int bidSize, offerSize;
    public final S stock;


    public Quote(BigDecimal bid, BigDecimal offer, int bidSize, int offerSize, S stock) {
        this.bid = bid;
        this.offer = offer;
        this.bidSize = bidSize;
        this.offerSize = offerSize;
        this.stock = stock;
    }
}
