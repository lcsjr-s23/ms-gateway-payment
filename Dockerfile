FROM maven:3.8.1-jdk-11 as BUILD

COPY . /usr/src/app
RUN mvn --batch-mode -f /usr/src/app/pom.xml clean package

FROM openjdk:11-jre-slim
COPY --from=BUILD /usr/src/app/target/ms-payment-*.jar ms-payment.jar

ENTRYPOINT ["java","-jar","ms-payment.jar"]
