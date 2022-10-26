package com.yooyeon.commerce.domain.common;

public enum ProductStatus implements EnumMapperType {

    RESERVED("RESERVED", "예약 중"),
    SOLD("SOLD", "판매 완료된 상품"),
    DECLARED("DECLARED", "신고 상품"),
    SALE("SOLD", "판매 중인 상품");

    private final String code;
    private final String des;

    ProductStatus(String code, String des) {
        this.code = code;
        this.des = des;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDes() {
        return des;
    }
}