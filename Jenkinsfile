@Library('my-shared-library') _  // Load the shared library

pipeline {
    agent any

    environment {
        APP_NAME = "my-node-app"
        ENVIRONMENT = "production"
    }

    stages {
        stage('Build') {
            steps {
                script {
                    echo "Building application..."
                }
            }
        }

        stage('Deploy') {
            steps {
                deployApp(APP_NAME, ENVIRONMENT)
            }
        }
    }
}
