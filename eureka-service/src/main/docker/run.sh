#!/bin/sh

java -Dspring.profiles.active=$PROFILE -jar /usr/local/eureka-service/@project.build.finalName@.jar