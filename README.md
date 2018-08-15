# docker-spotify-demo

### login to private registry v1 (used in this app as an example, but is less secure than the other option of logging in below) 
docker login -u <DOCKER_REGISTRY_USERNAME> -p <DOCKER_REGISTRY_PASSWORD> <DOCKER_REGISTRY_URL>

### login to private registry v2(preferred login per Azure - to prevent credentials being saved in bash history. file-with-pwd.txt in this case is a simple text file where the contents is the raw text password) 
cat ~/file-with-pwd.txt docker login -u <DOCKER_REGISTRY_USERNAME> -password-stdin <DOCKER_REGISTRY_URL>

### login to private registry using txt file (docker-config.txt) with env variable $AZ_DOCKER_REGISTRY_PASSWORD
envsubst < ~/docker-config.txt > ~/docker-config-tmp.txt && cat ~/docker-config-tmp.txt | docker login -u $AZ_DOCKER_REGISTRY_USERNAME --password-stdin $AZ_DOCKER_REGISTRY_URL && rm ~/docker-config-tmp.txt

### push image
docker image push <DOCKER_REGISTRY_URL>/image-name
