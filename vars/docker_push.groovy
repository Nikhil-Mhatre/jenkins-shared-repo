def call(String PROJECT, String IMAGE_TAG, String DOCKET_CRED_ID){
  echo "****************** Pushing Code To DockerHub ******************"
  withCredentials(
      [usernamePassword(
          credentialsId:"${DOCKET_CRED_ID}",
          passwordVariable:"dockerHubPass",
          usernameVariable:"dockerHubUser")
      ]
  ){
      sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
      sh "docker tag ${PROJECT}:${IMAGE_TAG} ${env.dockerHubUser}/${PROJECT}:${IMAGE_TAG}"
      sh "docker push ${env.dockerHubUser}/${PROJECT}:${IMAGE_TAG}"
  }
  echo "****************** Successfully Pushed Code to DockerHub ******************"
}
