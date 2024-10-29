def call(){
  echo "****************** Deploying thr code ******************"
  sh "docker-compose down && docker-compose up -d"
  echo "****************** Code Deployed Successfully ******************"
}
