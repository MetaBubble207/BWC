package com.metabubble.BWC.dto;

import lombok.Data;


/**
 * Merchant的Dto
 */
@Data
public class MerchantDto {

    //商家id
    private Long id;

    //商家名称
    private String name;

    //商家图片
    private String pic;

    //平台类型，0为美团，1为饿了么
    private String plaType;

    //地址
    private String address;
}
