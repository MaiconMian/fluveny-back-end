rm -f *.jar
mvn clean install -DskipTests
cp target/*.jar fluveny.jar

docker-compose build && docker-compose up