#Create MySQL Image for JSP Tutorial Application
FROM mysql

ENV MYSQL_ROOT_PASSWORD 123456
#ADD jsp_backup.sql /docker-entrypoint-initdb.d

EXPOSE 3306