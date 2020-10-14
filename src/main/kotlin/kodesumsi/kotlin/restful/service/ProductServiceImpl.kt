package kodesumsi.kotlin.restful.service

import kodesumsi.kotlin.restful.entity.Product
import kodesumsi.kotlin.restful.model.CreateProductRequest
import kodesumsi.kotlin.restful.model.ProductResponse
import kodesumsi.kotlin.restful.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(
        val productRepository: ProductRepository
): ProductService {

    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        val product = Product(
                id = createProductRequest.id,
                name = createProductRequest.name,
                price = createProductRequest.price,
                quantity = createProductRequest.quantity,
                createdAt = Date(),
                updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
                id = product.id,
                name = product.name,
                price = product.price,
                quantity = product.quantity,
                createdAt = product.createdAt,
                updatedAt = product.updatedAt
        )
    }

}