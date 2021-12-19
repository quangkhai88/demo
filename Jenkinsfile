
pipeline {
    
    agent any
    tools {
        maven "MAVEN"
        jdk "JDK"
    }
    stages {

       stage('Package') {
            steps {
                echo 'Package... (on windows)'
                
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat 'mvn test'
            }
        }
        stage('Build docker image') {
            steps {
                echo 'Build docker image..'
                
                bat 'docker build -t kakaict/github-action-cd-ci .'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }

    }
}