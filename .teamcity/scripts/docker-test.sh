#!/bin/bash

# exit when any command fails
set -e

docker run \
    --name tc_test_all \
    -e SCENARIO= \
    -e TEST_ENV=test \
    -v ~/test_0_all_scenarios/ExecutionReports:/code/ExecutionReports \
    -v ~/test_0_all_scenarios/target:/code/target ecr.altono.app/altonomy/qa-bdd:test
