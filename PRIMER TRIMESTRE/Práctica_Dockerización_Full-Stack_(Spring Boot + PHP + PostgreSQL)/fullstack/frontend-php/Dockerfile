FROM php:8.2-apache

# Necesario para compilar pdo_pgsql (trae libpq-fe.h y pg_config)
RUN apt-get update \
  && apt-get install -y --no-install-recommends libpq-dev \
  && docker-php-ext-install pdo pdo_pgsql \
  && rm -rf /var/lib/apt/lists/*

# (opcional) mod_rewrite si luego lo necesitas
# RUN a2enmod rewrite

COPY src/ /var/www/html/
