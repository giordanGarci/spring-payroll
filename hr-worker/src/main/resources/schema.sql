CREATE TABLE tb_worker (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    daily_income DOUBLE NOT NULL
);

INSERT INTO tb_worker (name, daily_income) VALUES ('Bob', 200.0);
INSERT INTO tb_worker (name, daily_income) VALUES ('Maria', 300.0);
INSERT INTO tb_worker (name, daily_income) VALUES ('Alex', 250.0);
