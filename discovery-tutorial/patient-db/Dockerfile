FROM mysql

ADD ./schema.sql /tmp/schema.sql

ENTRYPOINT mysql -u root -p$MYSQL_ROOT_PASSWORD < /tmp/schema.sql