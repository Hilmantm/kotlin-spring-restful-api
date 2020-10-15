package kodesumsi.kotlin.restful.controller

import kodesumsi.kotlin.restful.model.CreateProductRequest
import kodesumsi.kotlin.restful.model.ProductResponse
import kodesumsi.kotlin.restful.model.UpdateProductRequest
import kodesumsi.kotlin.restful.model.WebResponse
import kodesumsi.kotlin.restful.service.ProductService
import kodesumsi.kotlin.restful.validation.ValidationUtil
import org.springframework.web.bind.annotation.*

@RestController
class ProductController(
        val productService: ProductService
) {

    @PostMapping(
            value = ["/api/products"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createProduct(
            @RequestBody createProductRequest: CreateProductRequest
    ): WebResponse<ProductResponse> {
        val productResponse = productService.create(createProductRequest)

        return WebResponse(
                code = 200,
                status = "OK",
                data = productResponse
        )
    }

    @GetMapping(
            value = ["/api/products/{idProduct}"]
    )
    fun getProduct(
            @PathVariable("idProduct") id: String
    ): WebResponse<ProductResponse> {
        val productResponse = productService.get(id)

        return WebResponse(
                code = 200,
                status = "OK",
                data = productResponse
        )
    }

    @PutMapping(
            value = ["/api/products/{idProduct}"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun updateProduct(
        @PathVariable("idProduct") id: String,
        @RequestBody updateProductRequest: UpdateProductRequest
    ): WebResponse<ProductResponse> {
        val productResponse = productService.update(id, updateProductRequest)

        return WebResponse(
                code = 200,
                status = "OK",
                data = productResponse
        )
    }

}