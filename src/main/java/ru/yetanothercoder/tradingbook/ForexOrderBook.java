package ru.yetanothercoder.tradingbook;

/**
 * @author Mikhail Baturov | www.yetanothercoder.ru
 */
public class ForexOrderBook extends SkipListsOrderBook<Currency> {
    public ForexOrderBook(Side side) {
        super(side);
    }
}
