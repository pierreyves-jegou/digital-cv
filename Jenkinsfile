pipeline {
   agent any
   tools {
      mvn 'maven'
   }
   
   stages {
      stage('Build') {
         steps {
            echo 'test'
            sh 'mvn clean compile'
         }
      }
      stage('Test') {
         steps {
            sh 'mvn test'
         }
      }
   }
}
