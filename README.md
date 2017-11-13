# Marky

This is the server component of 'Marky - marks for teachers'

## Getting Started

These instructions will give you a copy of the this project (the marky server).
If you follow the instructions below (running on minishift) you will not only get a running server but also a running client.
The client code is cloned from https://github.com/riv7/marky.git automatically within the minishift build process.

### Prerequisites

To run on minihift you need the following

```
Installed minishift version, see https://docs.openshift.org/latest/minishift/getting-started/installing.html
Installed git-client
```

### Installing

Clone the project

```
git clone https://github.com/riv7/marky-server.git
```

Navigate to project dir, e.g.:

```
cd ~/projects/marky-server
```

Navigate to scripts/openshift dir:

```
cd scripts/openshift
```

Create new minishift project. The first parameter is the project name which has to be unique within your minishift
environment. If you leave the first parameter empty, the default projectname 'marky' is choosen:

```
./create-minishift-project.sh

or 

./create-minishift-project.sh MarkySecondProject 
```

