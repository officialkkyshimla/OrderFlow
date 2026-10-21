package com.orderflow.backend.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

@Getter 
@Setter 
public class BuyEntity {
    private long Id;
    private long orderId;
    private long accountId;
    private double price;
    private long quantity;
    private byte side;       // 1 = Buy, 2 = Sell
    private byte orderType;  // 1 = Limit, 2 = Market

    public BuyEntity() {
    }

    @Builder
    public BuyEntity(long Id, long orderId, long accountId, double price,
                     long quantity, byte side, byte orderType) {
        this.Id = Id;
        this.orderId = orderId;
        this.accountId = accountId;
        this.price = price;
        this.quantity = quantity;
        this.side = side;
        this.orderType = orderType;
    }

    public void clear() {
        this.Id = 0L;
        this.orderId = 0L;
        this.accountId = 0L;
        this.price = 0.0;
        this.quantity = 0L;
        this.side = (byte) 0;
        this.orderType = (byte) 0;
    }

    
}
