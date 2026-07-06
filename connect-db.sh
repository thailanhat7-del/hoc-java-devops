#!/bin/bash
docker exec -it $(docker ps -qf "name=postgres-db") psql -U devops_user -d mydb