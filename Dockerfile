FROM maven as cbal
COPY . /
RUN mvn clean package

FROM openjdk:8-jdk-alpine
COPY --from=cbal /target/demo-0.0.1-SNAPSHOT.jar /
CMD java -jar /demo-0.0.1-SNAPSHOT.jar








