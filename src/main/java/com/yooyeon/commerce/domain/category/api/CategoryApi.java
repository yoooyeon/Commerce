package com.yooyeon.commerce.domain.category.api;
import com.yooyeon.commerce.domain.category.dto.CategoryDto;
import com.yooyeon.commerce.domain.category.entity.Category;
import com.yooyeon.commerce.domain.category.repository.CategoryRepository;
import com.yooyeon.commerce.global.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.yooyeon.commerce.domain.category.dto.CategoryDto.*;


@Slf4j
@ResponseBody
@RequiredArgsConstructor
@Controller
@RequestMapping("api/v1.0/category")
public class CategoryApi {

    private final CategoryRepository categoryRepository;

    /**
     * 카테고리 등록
     */
    @PostMapping("{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<Detail> createCategory(@PathVariable String name) {
        Category build = Category.builder().name(name).build();

        Category response = categoryRepository.save(build);
        Detail detail = Detail.builder().build().toDto(response);
        return ApiResponse.createSuccess(detail);
    }
}