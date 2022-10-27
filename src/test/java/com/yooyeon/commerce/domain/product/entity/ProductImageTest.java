package com.yooyeon.commerce.domain.product.entity;

import com.yooyeon.commerce.domain.common.ProductStatus;
import com.yooyeon.commerce.domain.product.repository.ProductImageRepository;
import com.yooyeon.commerce.domain.product.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataJpaTest
@ExtendWith(SpringExtension.class)
@DisplayName("Product Image Test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProductImageTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductImageRepository productImageRepository;

    @Test
    void save() {
        //given
        Product product = Product.builder().price(3000).title("test").status(ProductStatus.SALE).build();
        Product save = productRepository.save(product);
        ProductImage testImage = ProductImage.builder().imageName("test image").imagePath("/test/path").product(save).build();

        //when
//        ProductImage savedImage = save.addProductImage(testImage);
        ProductImage savedImage = productImageRepository.save(testImage);

        //then
        Assertions.assertEquals(testImage.getImageName(), savedImage.getImageName());
        Assertions.assertEquals("test image", savedImage.getImageName());
        Assertions.assertEquals("/test/path", savedImage.getImagePath());
    }
}