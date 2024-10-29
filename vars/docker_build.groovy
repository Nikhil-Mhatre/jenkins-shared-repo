def call(String PROJECT_NAME, String IMAGE_TAG, String DOCKER_HUB_USER){
  sh "docker build -t ${DOCKER_HUB_USER}/${PROJECT_NAME}:${IMAGE_TAG} ."
}
