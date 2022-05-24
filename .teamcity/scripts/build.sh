#!/bin/bash

# exit when any command fails
set -e

docker build \
    -t $DOCKER_IMAGE_NAME \
    -f $DOCKER_FILE_PATH \
    .
