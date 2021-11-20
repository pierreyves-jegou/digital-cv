
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                mvn clean compile
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying2d....'
            }
        }
    }
}
