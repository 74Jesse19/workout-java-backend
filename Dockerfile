FROM openjdk:17
RUN curl -o workoutapp.jar 44.210.4.101/workoutapp.jar
CMD ["java", "-jar", "workoutapp.jar"]