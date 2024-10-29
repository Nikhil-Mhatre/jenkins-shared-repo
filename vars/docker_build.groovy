def call(String PROJECT_NAME, String IMAGE_TAG, String DOCKET_CRED_ID){
  echo "****************** Building the code ******************"
  withCredentials(
        [usernamePassword(
            credentialsId:"${DOCKET_CRED_ID}",
            passwordVariable:"dockerHubPass",
            usernameVariable:"dockerHubUser")
        ]
    ){
     sh "docker build -t ${env.dockerHubUser}/${PROJECT_NAME}:${IMAGE_TAG} ."
    }
  echo "****************** Code Building Successfull ******************"
}
