package com.yooyeon.commerce.domain.common;

public enum NotiCode implements EnumMapperType {

    RESERVATION("RSV", "예약 알림"),
    KEYWORD("KW", "키워드 알림"),
    CHATTING("CHAT", "채팅 알림");

    private final String code;
    private final String des;

    NotiCode(String code, String des) {
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