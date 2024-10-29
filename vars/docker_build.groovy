def call(String PROJECT_NAME, String IMAGE_TAG, String DOCKER_HUB_USER){
  echo "****************** Building the code ******************"
  sh "docker build -t ${DOCKER_HUB_USER}/${PROJECT_NAME}:${IMAGE_TAG} ."
  echo "****************** Code Building Successfull ******************"
}
