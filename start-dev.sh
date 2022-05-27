#!/bin/bash
docker rm $(docker ps -qa --no-trunc --filter "status=exited")
docker-compose -f docker-compose-mysql.yml up
