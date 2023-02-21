# Project Name :hello
Docker k8 deployment steps :

git clone 
mvn clean install
docker login(login to docker hub https://hub.docker.com/)
docker build -t bhoomikars/hello:latest  (bhoomikars is the docker account name)
docker run -d -p 8080:8080 bhoomikars/hello (map your system port to docker container port run in demon mode)
docker push bhoomikars/hello -> this will by default push the latest image
check images in docker hub

#push latest image to k8

kubectl apply -f deployment.yaml
kubectl get service
kubectl get deployments
minikube service hello (start the minikube)
http://127.0.0.1:63066/swagger-ui.html

# support commands 
kubectl delete -f hello (to delete the pod)
minikube ip
