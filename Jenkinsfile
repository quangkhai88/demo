
CODE_CHANGE = getGitChange()
pipeline {
    
    agent any

    stages {

       stage('Build') {
           when {
               expression {
                   BRANCH_NAME == 'master' && CODE_CHANGE == true
               }
           }
            steps {
                echo 'Building..'

                    def mvnHome = tool name: 'Maven', type: 'maven'
                    def mvnCMD = "${mvnHome}/bin/mvn"
                    sh "${mvnCMD} clean package"

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

    post {
        always {
            
        }
        failure {

        }
    }
}