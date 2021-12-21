FROM openjdk:11
#VOLUME /tmp
#LABEL ${LABEL_GROUP}="${LABEL_ID}"
#LABEL description="${LABEL_DESCRIPTION}"
COPY target/apigateway-0.0.1-SNAPSHOT.jar /apigateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "apigateway-0.0.1-SNAPSHOT.jar"]
EXPOSE 8762
