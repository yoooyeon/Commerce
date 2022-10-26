package com.yooyeon.commerce.domain.common;

import javax.persistence.Converter;

@Converter(autoApply = true)
public class ProductStatusConverter extends EnumValueConverter<ProductStatus> {
    ProductStatusConverter() {
        super(ProductStatus.class);
    }
}