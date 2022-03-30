#!/usr/bin/env sh

/usr/bin/java -XX:+UseContainerSupport -Xmx256m -Xss512k -XX:MetaspaceSize=100m -jar /apps/test-git-cd-ci.jar