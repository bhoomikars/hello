# Project Name :hello
Docker k8 deployment steps :

1. git clone 
2. mvn clean install
3. docker login(login to docker hub https://hub.docker.com/)
4. docker build -t bhoomikars/hello:latest  (bhoomikars is the docker account name)
5. docker run -d -p 8080:8080 bhoomikars/hello (map your system port to docker container port run in demon mode)
6. docker push bhoomikars/hello -> this will by default push the latest image
7. check images in docker hub

#push latest image to k8

1. kubectl apply -f deployment.yaml
2. kubectl get service
3. kubectl get deployments
4. minikube service hello (start the minikube)
5. verify swagger http://127.0.0.1:63066/swagger-ui.html

# support commands 
1. kubectl delete -f hello (to delete the pod)
2. minikube ip
3. login to conatiner docker exec -it 6fff05f4b53e /bin/sh (specify conatiner id)
<img width="995" alt="Screenshot 2023-02-21 at 9 49 19 AM" src="https://user-images.githubusercontent.com/57263117/220246782-3a684dd4-9b01-4cc1-b929-857e2e8b3dbf.png">
