#!/bin/bash

#path_to_repo="$1"

DIR="$(cd "$(dirname "$0")" && pwd)"
PROJECT_NAME="$1"

#readonly FEATUREBRANCH-PREFIX=Feature/
#BRANCH_NAME="$1"
#PROJECT=$FEATUREBRANCH-PREFIX$FEATURE-NAME
#APP_NAME=${APP_NAME:=hello-server}

echo "Creating marky application..."
echo "=========================="

#echo "(1/4) Applying extra permissions..."

# This adds anyuid and hostaccess security context constraints to default service account
# This is acceptable for a dev environment only
#oc login -u system:admin
#oc adm policy add-scc-to-user anyuid system:serviceaccount:$PROJECT:default
#oc adm policy add-scc-to-user hostaccess system:serviceaccount:$PROJECT:default
echo "developer" | oc login -u developer
echo "=========================="
echo "(1/4) Creating new project $PROJECT_NAME..."

#oc new-project feat1 --display-name="feat1" --description="A marky project with minishift"
oc new-project ${PROJECT_NAME} --display-name=${PROJECT_NAME} --description="A marky project with minishift"

echo "=========================="
echo "(2/4) create application from template..."

oc process -f "$DIR"/../../openshift/openshift-marky-template.yaml \
    -p NAMESPACE=${PROJECT_NAME} \
    -n ${PROJECT_NAME} | oc create -f -


#echo "(4/4) Building hello-server Image"
#oc start-build $APP_NAME --from-dir $DIR/../hello-server --follow