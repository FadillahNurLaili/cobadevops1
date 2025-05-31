CREATE TABLE IF NOT EXISTS room (
    id INT AUTO_INCREMENT PRIMARY KEY,
    room_price DOUBLE,
    room_type VARCHAR(50),
    photo VARCHAR(255),
    is_booked BOOLEAN
);
