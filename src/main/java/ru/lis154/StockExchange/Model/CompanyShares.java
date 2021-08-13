package ru.lis154.StockExchange.Model;

import lombok.Data;

@Data
public class CompanyShares {
    public String symbol;
    public String companyName;
    public String primaryExchange;
    public String calculationPrice;
    public int open;
    public Object openTime;
    public String openSource;
    public int close;
    public Object closeTime;
    public String closeSource;
    public int high;
    public Object highTime;
    public Object highSource;
    public int low;
    public Object lowTime;
    public Object lowSource;
    public double latestPrice;
    public String latestSource;
    public String latestTime;
    public long latestUpdate;
    public Object latestVolume;
    public double iexRealtimePrice;
    public int iexRealtimeSize;
    public long iexLastUpdated;
    public Object delayedPrice;
    public Object delayedPriceTime;
    public Object oddLotDelayedPrice;
    public Object oddLotDelayedPriceTime;
    public Object extendedPrice;
    public Object extendedChange;
    public Object extendedChangePercent;
    public Object extendedPriceTime;
    public double previousClose;
    public int previousVolume;
    public double change;
    public double changePercent;
    public int volume;
    public double iexMarketPercent;
    public int iexVolume;
    public int avgTotalVolume;
    public int iexBidPrice;
    public int iexBidSize;
    public int iexAskPrice;
    public int iexAskSize;
    public double iexOpen;
    public long iexOpenTime;
    public double iexClose;
    public long iexCloseTime;
    public long marketCap;
    public double peRatio;
    public double week52High;
    public double week52Low;
    public double ytdChange;
    public long lastTradeTime;
    public String currency;
    public boolean isUSMarketOpen;
}
