pipeline {
   agent any
   tools {
      maven 'MAVEN'
   }
   
   stages {
      stage('Build') {
         steps {
            echo 'test'
            bat "mvn install"
         }
      }
      stage('Test') {
         steps {
            echo 'test'
         }
      }
   }
}
