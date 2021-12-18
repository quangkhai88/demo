pipeline {
    agent { node { label 'cd-ci' } }
    stages {
        stage('SCM Checkout'){
            step {
                echo 'Checkout'
            }
        }

        stage('Mvn Package'){
            step {
                echo 'Package'
            }
        }

        stage('Build Docker Image'){
            step {
                echo 'Build Docker Image'
            }
        }
    }
}