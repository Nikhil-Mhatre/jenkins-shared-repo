def call(String Project, String ImageTag, String dockerhubuser, String dockerCredId){
  echo "****************** Pushing Code To DockerHub ******************"
  withCredentials(
    [usernamePassword(
      credentialsId: "${dockerCredId}",
      passwordVariable: 'dockerhubpass',
      usernameVariable: 'dockerhubuser')
    ] 
  ){
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
  echo "****************** Successfully Pushed Code to DockerHub ******************"
}
