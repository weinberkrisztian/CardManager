DROP TABLE IF EXISTS card;

CREATE TABLE IF NOT EXISTS card (
  uuid UUID PRIMARY KEY,
  card_number varchar(100) NOT NULL,
  customer_uuid UUID NOT NULL,
  card_type varchar(100) NOT NULL,
  total_limit int NOT NULL,
  amount_used int NOT NULL,
  available_amount int NOT NULL,
  create_date timestamp DEFAULT NULL
);