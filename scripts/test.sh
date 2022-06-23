#!/bin/bash

mvn test -Denv=$2 -Dcucumber.filter.tags=$1
