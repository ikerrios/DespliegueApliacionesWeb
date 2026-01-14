-- PostgreSQL schema for entity com.hellin.despliegue_api_rest.entity.Pet
-- Compatible con Neon y JPA GenerationType.IDENTITY

CREATE DATABASE IF NOT EXISTS jugetes CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE jugetes;

CREATE TABLE IF NOT EXISTS jugete (
  id BIGINT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  cantidad INT NOT NULL,
  frase VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Datos iniciales (opcional)
INSERT INTO jugete (name, cantidad, frase) VALUES
('Juanaco', '22', 'Noche de inla'),
('Juanky', '24', 'factou'),
('Iker Rios', '20', 'hace media?'),
('Pablo', '23', 'Buenas tarde amigo'),
('Miguel', '23', 'Comprension lectora'),
('Antonio', '30', 'delegado?');