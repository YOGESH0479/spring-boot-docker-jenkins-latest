# Use a base image with Tomcat 10 and Java 17
FROM tomcat:10.1-jdk17

# Remove the default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Add the WAR file to the Tomcat webapps directory
COPY ./BankCreditCardStatement-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]