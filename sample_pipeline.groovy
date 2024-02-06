pipeline {

    agent any
    
    stages {
    
        stage('Git Checkout') {
    
            steps {
    
                    checkout the code: 'Get it from Jenkins Snippet generator'
    
            }
    
        }
    
        stage('Build') { 
    
            steps {
                //    
            }
    
        }

        stage('Test') {

            steps {
                //   
            }

        }
    
        stage('Sonarqube') { 
    
            steps {
                // 
            }
    
        }

        stage('Artifactory') {

            steps {
                //   
            }

        }
    
        stage('Deploy') { 
    
            steps {
                // 
            }
        
        }
        
        stage('Trigger Another Job') {
        
            steps {
        
                    build job: 'mySecondJob', wait: false
        
            }
        
        }      
    
    }

}