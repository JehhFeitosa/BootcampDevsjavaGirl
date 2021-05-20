# BootcampDevsJavaGirl

##Bootcamp Java do Básico a API

###Dias 23 e 24/04/2021
Criei um sistema de livraria com POO.

-Fiz um diário de bordo de todo o evento e disponibilizei no meu notion, segue o link abaixo:
https://www.notion.so/Bootcamp-Devs-Java-Girl-Java-do-B-sico-API-6bad4729c823448aaa4597aa88e29434


###O H2 é um banco em memória, para uso, se faz necessário colocar no arquivo proporties as seguintes informações

1. Passo 

```java
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

Observações:
Nos campos username e password, deve se colocar os seus respectivos dados dentro do arquivo proporties.

2. Passo

Depois de startar a aplicação, deve se acessar o [http://localhost:8080/h2-console/](http://localhost:8080/h2-console/) e setar as informações de spring.datasource.url, username e password. Clicar em teste, se retornar a mensagem de conexão positiva e depois conectar.

A partir daí, poderá utilizar o banco, enquanto a aplicação estiver startada. 😉
