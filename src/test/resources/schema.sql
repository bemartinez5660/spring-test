CREATE TABLE tbl_categories (
                                id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                name VARCHAR(255) NOT NULL
);

CREATE TABLE tbl_products (
                              id BIGINT AUTO_INCREMENT PRIMARY KEY,
                              name VARCHAR(255) NOT NULL,
                              description VARCHAR(255),
                              stock INT NOT NULL,
                              price DECIMAL(10, 2) NOT NULL,
                              status VARCHAR(50) NOT NULL,
                              created_at DATE NOT NULL,
                              category_id BIGINT,
                              FOREIGN KEY (category_id) REFERENCES tbl_categories(id)
);