def call(){
  echo "****************** Deploying thr code ******************"
  sh "docker compose up -d"
  echo "****************** Code Deployed Successfully ******************"
}
