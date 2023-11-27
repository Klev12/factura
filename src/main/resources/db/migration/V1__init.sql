CREATE TABLE IF NOT EXISTS client (
    id INT PRIMARY KEY,
    nui VARCHAR(10) UNIQUE,
    fullname VARCHAR(50),
    address VARCHAR(50)
    );

CREATE TABLE IF NOT EXISTS product (
    id INT PRIMARY KEY,
    description VARCHAR(300),
    brand VARCHAR(30),
    price DECIMAL(10, 2),
    stock INT
    );

CREATE TABLE IF NOT EXISTS invoice (
    id INT PRIMARY KEY,
    code VARCHAR(30) UNIQUE,
    create_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10, 2),
    client_id INT,
    FOREIGN KEY (client_id) REFERENCES client(id)
    );

CREATE TABLE IF NOT EXISTS detail (
    id INT PRIMARY KEY,
    quantity INT,
    price DECIMAL(10, 2),
    invoice_id INT,
    product_id INT,
    FOREIGN KEY (invoice_id) REFERENCES invoice(id),
    FOREIGN KEY (product_id) REFERENCES product(id)
    );
