package kodesumsi.kotlin.restful.repository

import kodesumsi.kotlin.restful.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, String> {

}