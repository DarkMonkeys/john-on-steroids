FROM maven
ADD src /src
ADD pom.xml /pom.xml
RUN mvn clean install
