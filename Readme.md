# Getting Started

Snappbox assignment project needs docker and docker-compose for starting.

After cloning the project, You must run these two commands to create docker image and running docker compose, to prepare
other containers.

1. > docker build . -t snappbox/contact:1.0
2. > docker-compose up

* The project will be available on port 8085, and the base path is:
> */snappbox/resources*
* All the APIs supports *Hateoas*
> http://localhost:8085/snappbox/resources/contact
# Test APIs
For testing apis there is swagger-ui that will be available throw this address: 
> http://localhost:8085/swagger-ui.html

