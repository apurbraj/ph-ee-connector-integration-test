FROM openjdk:17

WORKDIR /app
COPY . .
RUN ls
CMD ./gradlew cucumberCli