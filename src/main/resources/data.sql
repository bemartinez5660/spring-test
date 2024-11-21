
INSERT INTO microservices.public.tbl_categories ( name)
VALUES ( 'shoes');
INSERT INTO microservices.public.tbl_categories ( name)
VALUES ( 'books');
INSERT INTO microservices.public.tbl_categories ( name)
VALUES ( 'electronics');

INSERT INTO microservices.public.tbl_products ( name, description, stock, price, status, created_at, category_id)
VALUES ('adidas', 'adidas shoess', 2, 100, 'available',
        '2000-05-05', 1);
INSERT INTO microservices.public.tbl_products ( name, description, stock, price, status, created_at, category_id)
VALUES ( 'nike', 'nike shoess', 2, 100, 'available', '2000-05-05', 1);

INSERT INTO microservices.public.tbl_products ( name, description, stock, price, status, created_at, category_id)
VALUES ( 'puma', 'puma shoess', 2, 100, 'available', '2000-05-05', 2);