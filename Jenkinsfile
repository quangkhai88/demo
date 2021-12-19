
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
                
                sh "mvn clean package"
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