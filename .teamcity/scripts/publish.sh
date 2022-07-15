#!/bin/bash

# exit when any command fails
set -e

VERSION=0.0.24

# tag images
docker tag $DOCKER_IMAGE_NAME "$ALT_REPO_ECR/$DOCKER_IMAGE_NAME:$VERSION"
docker tag $DOCKER_IMAGE_NAME "$ALT_REPO_ECR/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG"

# upload image
aws ecr get-login-password --region ap-southeast-1 | docker login --username AWS --password-stdin $ALT_REPO_ECR
docker push "$ALT_REPO_ECR/$DOCKER_IMAGE_NAME:$VERSION"
docker push "$ALT_REPO_ECR/$DOCKER_IMAGE_NAME:$DOCKER_IMAGE_TAG"
