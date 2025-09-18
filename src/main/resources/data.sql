-- 주문 데이터
INSERT INTO orders (id, order_date, status)
VALUES (1, '2025-09-18', 'ORDERED');

INSERT INTO orders (id, order_date, status)
VALUES (2, '2025-09-17', 'DELIVERED');

INSERT INTO orders (id, order_date, status)
VALUES (3, '2025-09-16', 'ORDERED');

-- 상품 데이터
INSERT INTO product (id, name, price, order_id)
VALUES (1, '노트북', 1200000, 1);

INSERT INTO product (id, name, price, order_id)
VALUES (2, '마우스', 25000, 1);

INSERT INTO product (id, name, price, order_id)
VALUES (3, '키보드', 55000, 2);

INSERT INTO product (id, name, price, order_id)
VALUES (4, '스피커', 85000, 3);

-- 배송 데이터
INSERT INTO delivery (id, address, delivery_date, status, order_id)
VALUES (1, '서울시 강남구 테헤란로 123', '2025-09-19', 'READY', 1);

INSERT INTO delivery (id, address, delivery_date, status, order_id)
VALUES (2, '부산시 해운대구 센텀로 456', '2025-09-18', 'DELIVERED', 2);

INSERT INTO delivery (id, address, delivery_date, status, order_id)
VALUES (3, '대구시 수성구 달구벌대로 789', '2025-09-20', 'CANCELLED', 3);