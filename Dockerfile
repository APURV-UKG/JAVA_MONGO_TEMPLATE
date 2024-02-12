#FROM openjdk:17
#
## Set default values for environment variables
#ENV APP_PORT=8080
#ENV MONGO_PORT=27017
#
## Expose the specified ports
#EXPOSE $APP_PORT $MONGO_PORT
#
#ADD target/mongodock.jar mongodock.jar
#
## Use CMD instead of ENTRYPOINT to allow for variable substitution
#CMD ["java", "-jar", "/mongodock.jar", "--server.port=${APP_PORT}", "--mongo.port=${MONGO_PORT}"]
#
#
#docker run -e APP_PORT=8081 -e MONGO_PORT=27018 -p 8081:8081 -p 27018:27018 your_image_name

#FROM openjdk:17
#EXPOSE 8080
#RUN ./gradlew build
#ADD build/libs/mongoApp-0.0.1-SNAPSHOT.jar mongoApp-0.0.1-SNAPSHOT.jar
#ENV CONN_STR=mongodb+srv://geetikawadhwa:iRiW6pt-ckcmER2@cluster1.enhrp.mongodb.net/
#ENTRYPOINT ["java", "-jar","/mongoApp-0.0.1-SNAPSHOT.jar"]


FROM gradle:7-jdk17
EXPOSE 8080
WORKDIR /MongoApp
#ENV CONN_STR=mongodb+srv://geetikawadhwa:iRiW6pt-ckcmER2@cluster1.enhrp.mongodb.net/
COPY build.gradle settings.gradle /MongoApp/
COPY . .
RUN chmod +x gradlew
RUN ./gradlew build -x test
CMD ["java", "-jar", "build/libs/mongoApp-0.0.1-SNAPSHOT.jar"]



# Use a base image with Java and Gradle
#FROM openjdk:11-jdk-slim
#FROM openjdk:17
#EXPOSE 8080
## Set the working directory inside the container
#WORKDIR /app

#Copy Json File
#COPY access.json /app

# Set the GOOGLE_APPLICATION_CREDENTIALS environment variable
#ENV GOOGLE_APPLICATION_CREDENTIALS=/app/access.json

# Copy the Gradle files first to leverage caching
#COPY build.gradle settings.gradle /app/
#
## Copy the entire project
#COPY . .
#
## Build the project with Gradle
#RUN chmod +x gradlew
#RUN ./gradlew build

# Expose the port that your Spring Boot application will run on
#EXPOSE 8080

# Specify the command to run your Spring Boot application



#FROM openjdk:17
##all the commands inside this image will be going to be executed in /app folder
#WORKDIR /mongoApp
#COPY ./build/libs/mongodock.jar /mongoApp/mongodock.jar
## Assuming you have Maven installed
##install necessary pacakages , so the user should not run these commands manually
##therefore we need to provide it here so when image is executed it will auto
##matically start with the following run commands
#RUN mvn clean install
#EXPOSE 8080
##jo bhi folder neeche mention kiya h usme jar file create hojygi jaise iss case mei
## target folder h
#ADD target/mongodock.jar mongodock.jar
#CMD ["java", "-jar", "mongodock.jar"]
##first file that we want to excecute inside the docker container
#ENTRYPOINT ["java", "-jar","/mongodock.jar"]

#example of add which can fetch from external URL
#FROM ubuntu:latest
#WORKDIR /app
#ADD http://example.com/archive.tar.gz /app/
#RUN tar -xzf archive.tar.gz

#example of copy which can fetch from only local system files
#FROM ubuntu:latest
#WORKDIR /app
#COPY ./archive.tar.gz /app/
#RUN tar -xzf archive.tar.gz

