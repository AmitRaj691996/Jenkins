def call(){
sh '''
  sudo ls -lart ${WORKSPACE} 
  sudo cd ${WORKSPACE}
  sudo mvn validate compile 
  
  
  '''
  
}
