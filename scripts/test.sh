#!/bin/bash

mvn test -Denv=staging -Dcucumber.filter.tags=$1
