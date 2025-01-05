@Library('my-shared-library') _  // Load the shared library

pipeline {
    agent any

    environment {
        IMAGE_NAME = "nginx"
        TAG = "latest"
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
