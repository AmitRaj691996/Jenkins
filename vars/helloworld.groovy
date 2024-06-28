def call(){
sh '''
  sudo ls -lart ${WORKSPACE} 
  
  sudo mvn validate compile 
  
  
  '''
  
}
