
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
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }

    }
}