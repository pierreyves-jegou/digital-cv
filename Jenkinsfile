pipeline {
   agent any
   tools {
      maven 'MAVEN'
   }
   
   stages {
      stage('Build') {
         steps {
            echo 'test'
            mvn clean compile
         }
      }
      stage('Test') {
         steps {
            sh 'mvn test'
         }
      }
   }
}
