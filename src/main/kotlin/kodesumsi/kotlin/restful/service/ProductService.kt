package kodesumsi.kotlin.restful.service

import kodesumsi.kotlin.restful.model.CreateProductRequest
import kodesumsi.kotlin.restful.model.ProductResponse

interface ProductService {

    fun create(createProductRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

}