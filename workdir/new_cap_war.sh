\rm /home/cicd/mavenlabs/capstone/workdir/temp/war/*.war
ls /home/cicd/mavenlabs/capstone/workdir/temp/CRM/crm-portal/0.0.1-SNAPSHOT/*.war | tail -1 | xargs cp -t /home/cicd/mavenlabs/capstone/workdir/temp/war/
cp /home/cicd/mavenlabs/capstone/workdir/temp/war/*.war /home/cicd/mavenlabs/capstone/workdir/dockswarm/dockimage/CRMportal.war
