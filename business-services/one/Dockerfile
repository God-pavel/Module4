FROM openjdk:11
#VOLUME /tmp
#LABEL ${LABEL_GROUP}="${LABEL_ID}"
#LABEL description="${LABEL_DESCRIPTION}"
COPY target/one-0.0.1-SNAPSHOT.jar /one-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "one-0.0.1-SNAPSHOT.jar"]
EXPOSE 8763

