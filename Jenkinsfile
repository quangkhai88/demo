pipeline {
    agent any
    stages {
        stage("SCM Checkout"){
            steps {
                sh 'mvn --version'
                echo 'Checkout'
            }
        }

        stage("Mvn Package"){
             steps {
                echo 'Package'
            }
        }
    }
}