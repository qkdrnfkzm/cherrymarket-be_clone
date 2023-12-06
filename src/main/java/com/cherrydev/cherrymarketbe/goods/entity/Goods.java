package com.cherrydev.cherrymarketbe.goods.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor
public class Goods {

    private Long goodsId;
    private String goodsName;
    private String description;
    private int price;
    private int retailPrice;
    private int inventory;
    private String storageType;
    private String capacity;
    private Timestamp expDate;
    private String allergyInfo;
    private String originPlace;
    private String salesStatus;

    @Builder
    public Goods(Long goodsId, String goodsName, String description, int price, int retailPrice, int inventory, String storageType, String capacity,
                 Timestamp expDate, String allergyInfo, String originPlace, String salesStatus) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.description = description;
        this.price = price;
        this.retailPrice = retailPrice;
        this.inventory = inventory;
        this.storageType = storageType;
        this.capacity = capacity;
        this.expDate = expDate;
        this.allergyInfo = allergyInfo;
        this.originPlace = originPlace;
        this.salesStatus = salesStatus;
    }

    public static Goods fromGoodsId(Long goodsId) {
        Goods goods = new Goods();
        goods.goodsId = goodsId;
        return goods;
    }
}