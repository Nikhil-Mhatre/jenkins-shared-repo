def call(String URL, String BRANCH){
  echo "****************** Cloning the code ******************"
  git url: "${URL}", branch: "${BRANCH}"
  echo "****************** Code Cloning Successfull ******************"
}
