package service_product.barbaro.service_product.service;

import org.springframework.stereotype.Service;
import service_product.barbaro.service_product.entity.Category;
import service_product.barbaro.service_product.entity.Product;
import service_product.barbaro.service_product.repository.ProductRepository;

import java.util.Date;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {

        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        product.setStatus("CREATED");
        product.setCreatedAt(new Date());
        productRepository.save(product);
        return product;
    }

    @Override
    public Product updateProduct(Product product) {
        Product productDB = productRepository.findById(product.getId()).orElse(null);
        if (productDB == null) {
            return null;
        }
        product.setStatus("UPDATED");
        product.setCreatedAt(productDB.getCreatedAt());
        productRepository.save(product);
        return productDB;
    }

    @Override
    public void deleteProduct(Long id) {
        Product productDB = productRepository.findById(id).orElse(null);
        if (productDB == null) {
            return;
        }
        productDB.setStatus("DELETED");
        productRepository.save(productDB);
    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(Category.builder().name(category).build());
    }

    @Override
    public Product updateStock(Long id, Double quantity) {
        Product product = productRepository.findById(id).orElse(null);
        if (product == null) {
            return null;
        }
        product.setStock(product.getStock() + quantity);
        return productRepository.save(product);
    }
}
