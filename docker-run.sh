docker run -d --network smartiqparser -p 3306:3306 --name smartiqparser-mysql-server mysql:latest -e MYSQL_ROOT_PASSWORD=a12345

docker run -d --network smartiqparser -p 8888:8888 --name smartiqparser-config-server config-server:0.0.1

docker run -d --network smartiqparser -p 8500:8500 --name smartiqparser-eureka-server eureka-server:0.0.1

docker run -d --network smartiqparser -p 8885:8885 --name smartiqparser-gateway-server gateway-server:0.0.1

docker run -d --network smartiqparser -p 8501:8501 --name smartiqparser-sahibinden-parser sahibinden-parser:0.0.1

docker run -d --network smartiqparser -p 8502:8502 --name smartiqparser-dod-parser dod-parser:0.0.1

docker run -d --network smartiqparser -p 8503:8503 --name smartiqparser-arabamcom-parser arabamcom-parser:0.0.1