pipeline {
    agent { node { label 'cd-ci' } }
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