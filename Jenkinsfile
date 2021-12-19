
pipeline {
    
    agent any
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    stages {

       stage('Build') {
            steps {
                echo 'Building... (on windows)'
                
                bat 'mvn -B -DskipTests clean package'
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