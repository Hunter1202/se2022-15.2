FROM ubuntu

MAINTAINER trucla

RUN apt-get update
RUN apt-get install wget -y
RUN apt-get install curl -y

CMD curl ifconfig.io