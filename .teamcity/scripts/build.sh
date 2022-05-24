#!/bin/bash

docker build \
    -t $DOCKER_IMAGE_NAME \
    -f $DOCKER_FILE_PATH \
    .
