#!/bin/bash

mvn test -Dcucumber.filter.tags=$1
