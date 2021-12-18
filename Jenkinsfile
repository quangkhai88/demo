pipeline {
    agent { node { label 'cd-ci' } }
    stages {
        stage("SCM Checkout"){
            steps {
                step {
                    echo 'Checkout'
                }
            }
        }

        stage("Mvn Package"){
             steps {
                step {
                    echo 'Package'
                }
            }
        }
    }
}