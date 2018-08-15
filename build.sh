#!/bin/bash
docker login -u $AZ_DOCKER_REGISTRY_USERNAME -p $AZ_DOCKER_REGISTRY_PASSWORD $AZ_DOCKER_REGISTRY_URL
mvn clean package docker:build docker:push
docker-compose up -d