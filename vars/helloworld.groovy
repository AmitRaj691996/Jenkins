def call(){
sh '''
  sudo useradd amit
  sudo cat /etc/passwd | grep amit
  
  '''
  
}
