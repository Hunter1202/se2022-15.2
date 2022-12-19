FROM tomcat:9.0.70-jdk17-corretto-al2

MAINTAINER trucla

RUN mv webapps webapps2 && mv webapps.dist webapps
ADD build/javaweb.war /usr/local/tomcat/webapps/
EXPOSE 8080
RUN chmod +x /usr/local/tomcat/bin/catalina.sh
CMD ["catalina.sh", "run"] -b 0.0.0.0