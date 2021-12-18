pipeline {
    agent { node { label 'cd-ci' } }
    stages {
        stage('SCM Checkout'){
            echo "Checkout"
        }

        stage('Mvn Package'){
            echo "Package..."

        }
        
        stage('Build Docker Image'){
            echo "Build Docker Image..."
        }
    }
}