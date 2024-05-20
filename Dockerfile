FROM openjdk:17
RUN curl -o workoutapp.jar 34.194.111.123/workoutapp.jar
CMD ["java", "-jar", "workoutapp.jar"]