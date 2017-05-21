#!/bin/sh

java -Dspring.cloud.config.uri=$CONFIGSERVER_URI -Dspring.profiles.active=$PROFILE -jar /usr/local/monitor-service/@project.build.finalName@.jar