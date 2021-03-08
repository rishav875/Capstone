docker stack rm crmportal
sleep 30
docker stack deploy -c /home/cicd/mavenlabs/capstone/workdir/dockswarm/swarm/docker-compose-crmportal.yaml crmportal
