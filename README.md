# Deep understanding of Spring Cloud and micro service construction catalog:
## 第5章 服务注册和发现Eureka
### http://localhost:8761
### http://localhost:8762/hi?name=lyn0801
## 第6章 负载均衡Ribbon
### http://localhost:8764/hi?name=lyn0801
## 第7章 声明式调用Feign
### http://localhost:8765/hi?name=lyn0801
## 第8章 熔断器Hystrix
### http://localhost:8764/hi?name=lyn0801
### http://localhost:8765/hi?name=lyn0801
## 第9章 路由网关Spring Cloud Zuul
### http://localhost:5000/v1/hiapi/hi?name=lyn0801
### http://localhost:5000/v1/ribbonapi/hi?name=lyn0801
### http://localhost:5000/v1/feignapi/hi?name=lyn0801
## 第10章 配置中心Spring Cloud Config
### http://localhost:8762/hi
### http://localhost:8763/hi
### http://localhost:15672
### http://localhost:8762/bus/refresh
## 第11章 服务链路追踪Spring Cloud Sleuth
### http://localhost:9411
### http://localhost:5000/user-api/user/hi
### http://localhost:15672
### http://localhost:9200
### http://localhost:5601
## 第12章 微服务监控Spring Boot Admin
### http://localhost:5000
### http://localhost:8762/hi?name=lyn0801
### http://localhost:8763/hi?name=lyn0801
## 第13章 Spring Boot Security 详解
### http://localhost:8080
## 第14章 使用Spring Cloud 0Auth2保护微服务系统
### http://localhost:8762/user/registry?username=lyn0801&password=123456
### {
###     "id": 8,
###     "username": "lyn0801",
###     "password": "$2a$10$7t54UHhoVDk5OotLqFqB3.9T3CGXNXCNRVYbnp7SQZLKNJ4PmIFwu",
###     "authorities": null,
###     "enabled": true,
###     "accountNonExpired": true,
###     "accountNonLocked": true,
###     "credentialsNonExpired": true
### }
### http://localhost:5000/uaa/oauth/token?grant_type=password&username=lyn0801&password=123456
### {
###     "access_token": "b31eee8f-3194-406b-a7bf-5a018d4bdb2f",
###     "token_type": "bearer",
###     "refresh_token": "44250426-edaf-4624-b043-c999ad9ea334",
###     "expires_in": 43111,
###     "scope": "server"
### }
### http://localhost:8762/hi
## 第15章 使用Spring Security 0Auth2 和JWT保护微服务系统
### keytool -genkeypair -alias lyn-jwt -validity 3650 -keyalg RSA -dname "CN=jwt,OU=lyn,O=lyn,L=zurich,S=zurich,C=CH" -keypass lyn0801 -keystore lyn-jwt.jks -storepass lyn0801
### keytool -list -rfc --keystore lyn-jwt.jks | openssl x509 -inform pem -pubkey
### http://localhost:9090/user/register?username=lyn0801&password=123456
### http://localhost:9090/user/login?username=lyn0801&password=123456
### {
###     "jwt": {
###         "access_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1Mzk2NTc0NTQsInVzZXJfbmFtZSI6Imx5bjA4MDEiLCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6IjNiYzg4ZDI5LTcyNTAtNGYxMS1iYjE4LTBhYThmZTgyZDczOCIsImNsaWVudF9pZCI6InVzZXItc2VydmljZSIsInNjb3BlIjpbInNlcnZpY2UiXX0.drpH9AFREobfbTQp1apz0E0ZRL9ETtirfTbQnmpRrb6fBrdhMukDwJUUfSIn4x1nUXyVIV6WWVFFKRHN3I6UiSXOYZ-TwOSfFbEc9j3xaXqtwaYI4s2ZWHBpDqNn-7xULQ52z4QTZ11drbpxqNa3nwo1Yi9oiZyMYkOX5NES3CIH8X9icq2ZqT2W774OKhaEKZjxBX6X-RkwNfv1lrW9BUwKnUOzvWhb7wpV9L1XFeE3hJfBouYjzcC8zMShyohk8KwiBaPW-M7DPjXNNlJlqTwf1DJ2KQHj5mECj_s4xXXdpAMi6ZCxbL0YTBDaEYCMKhjzpODXESuNBxc3c_I7Cg",
###         "token_type": "bearer",
###         "refresh_token": "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJseW4wODAxIiwic2NvcGUiOlsic2VydmljZSJdLCJhdGkiOiIzYmM4OGQyOS03MjUwLTRmMTEtYmIxOC0wYWE4ZmU4MmQ3MzgiLCJleHAiOjE1NDIyNDU4NTQsImF1dGhvcml0aWVzIjpbIlJPTEVfQURNSU4iXSwianRpIjoiMWY1NDFjMzItMjZlOC00M2NhLWFlYmItNzdmNzdlZmEwMzFkIiwiY2xpZW50X2lkIjoidXNlci1zZXJ2aWNlIn0.MeE8s-Wie7zNzPSNR8sS_6tMdlZEFZhi8CuIqVQbQiaC0br348Bsy11cw6eymoQ6hCiQ0gjFYYwic32sJzVh11kaSnGIrpVeeuIlWDJyXVt5AR0_QpDuNrethrwFPCcESr39SA2ddsv5sAbknS8-7WimtQZE-z40GlH87Bht7bzVVyzCe7vV471iRgb5opg4LiBbwK82S5b8LTNlTysv9JNHNpNDu7XXoayKwTrKiiQ-mCI4S6305ZzyEYdJ_LkWtcEStAsy39wNtsLDyLUPSiicJrriQIrbkqDNUad03OPB0Jx2TULmDcyo4s5aZhyZ33dtNxvHRIcgLMyqXYX2bg",
###         "expires_in": 3599,
###         "scope": "service",
###         "jti": "3bc88d29-7250-4f11-bb18-0aa8fe82d738"
###     },
###     "user": {
###         "id": 7,
###         "username": "lyn0801",
###         "password": "$2a$10$ZXN3YutWXQONCXvGAF5QPuAZyWS75h0bu9vNp/lzliViWSQJKpjwO",
###         "authorities": [
###             {
###                 "id": 2,
###                 "authority": "ROLE_ADMIN"
###             }
###         ],
###         "enabled": true,
###         "accountNonExpired": true,
###         "accountNonLocked": true,
###         "credentialsNonExpired": true
###     }
### }
### http://localhost:9090/foo
## 第16章 使用Spring Cloud 构建微服务综合案例
