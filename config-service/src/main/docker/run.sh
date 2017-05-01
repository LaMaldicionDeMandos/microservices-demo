#!/bin/sh

java -Dspring.profiles.active=$PROFILE -jar /usr/local/config-service/@project.build.finalName@.jar