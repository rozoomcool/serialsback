CREATE TABLE IF NOT EXISTS serial
(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    author      VARCHAR(255),
    tags        VARCHAR(255)
)