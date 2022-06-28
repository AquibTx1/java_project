#!/bin/bash

# exit when any command fails
set -e

/usr/bin/curl -X POST https://rundeck.altono.app/rundeck/api/21/job/$RUNDECK_STAGING_JOB_ID/run?authtoken=$ALT_REPO_RUNDECK_TOKEN
