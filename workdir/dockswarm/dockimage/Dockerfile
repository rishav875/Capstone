FROM debian:stretch
WORKDIR /opt/
ADD jdk-8u202-linux-x64.tar.gz /opt/
ADD apache-tomcat-8.5.61.tar.gz /opt/
ENV JAVA_HOME=/opt/jdk1.8.0_202
ENV PATH $JAVA_HOME/bin:$PATH
ADD CRMportal.war /opt/apache-tomcat-8.5.61/webapps/
EXPOSE 8080
CMD ["/opt/apache-tomcat-8.5.61/bin/catalina.sh" , "run"]
