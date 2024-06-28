def call(){
sh '''
  useradd amit
  cat /etc/passwd | grep amit
  
  '''
  
}
