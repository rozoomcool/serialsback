CREATE TABLE IF NOT EXISTS Genre (
                                     id SERIAL PRIMARY KEY,
                                     name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Tag (
                                   id SERIAL PRIMARY KEY,
                                   name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Serial (
                                      id SERIAL PRIMARY KEY,
                                      name VARCHAR(255),
                                      description VARCHAR(255),
                                      author VARCHAR(255),
                                      genre_id INT,
                                      FOREIGN KEY (genre_id) REFERENCES Genre(id)
);

CREATE TABLE IF NOT EXISTS Serial_Tag (
                                          serial_id INT,
                                          tag_id INT,
                                          FOREIGN KEY (serial_id) REFERENCES Serial(id),
                                          FOREIGN KEY (tag_id) REFERENCES Tag(id),
                                          PRIMARY KEY (serial_id, tag_id)
);