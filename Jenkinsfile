
pipeline {
    
    agent any
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    stages {

       stage('Build') {
            steps {
                echo 'Building..'
                
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }

    }
}