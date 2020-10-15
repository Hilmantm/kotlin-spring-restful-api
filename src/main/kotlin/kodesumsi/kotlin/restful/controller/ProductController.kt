package kodesumsi.kotlin.restful.controller

import kodesumsi.kotlin.restful.model.CreateProductRequest
import kodesumsi.kotlin.restful.model.ProductResponse
import kodesumsi.kotlin.restful.model.WebResponse
import kodesumsi.kotlin.restful.service.ProductService
import kodesumsi.kotlin.restful.validation.ValidationUtil
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(
        val productService: ProductService,
        val validationUtil: ValidationUtil
) {

    @PostMapping(
            value = ["/api/products"],
            produces = ["aplication/json"],
            consumes = ["aplication/json"]
    )
    fun createProduct(
            @RequestBody createProductRequest: CreateProductRequest
    ): WebResponse<ProductResponse> {
        validationUtil.validate(createProductRequest)

        val productResponse = productService.create(createProductRequest)

        return WebResponse(
                code = 200,
                status = "OK",
                data = productResponse
        )
    }

}