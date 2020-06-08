cd arabamcom-parser
mvn package docker:build
cd ..

cd config-server
mvn package docker:build
cd ..

cd dod-parser
mvn package docker:build
cd ..

cd eureka-server
mvn package docker:build
cd ..

cd gateway-server
mvn package docker:build
cd ..

cd sahibinden-parser
mvn package docker:build
cd ..