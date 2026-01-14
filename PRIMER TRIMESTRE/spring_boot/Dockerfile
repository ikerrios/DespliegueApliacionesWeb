FROM php:8.2-apache

# Instalar PostgreSQL extension
RUN apt-get update && apt-get install -y libpq-dev && docker-php-ext-install pdo pdo_pgsql

# Copiar el frontend al directorio correcto de Apache
COPY fullstack/frontend/ /var/www/html/

# Dar permisos
RUN chown -R www-data:www-data /var/www/html/

EXPOSE 80


#FROM php:8.2-apache
#RUN apt-get update \
 # && apt-get install -y --no-install-recommends libpq-dev \
  #&& docker-php-ext-install pdo pdo_pgsql \
 # && rm -rf /var/lib/apt/lists/*
#COPY ./index.php /var/www/html/
