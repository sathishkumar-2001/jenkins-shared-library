@Library('docker-pull-container-library') _  // Load the shared library

pipeline {
    agent any

    environment {
        IMAGE1_NAME = "nginx"
        IMAGE1_TAG = "latest"

        IMAGE2_NAME = "redis"
        IMAGE2_TAG = "6.2"

        IMAGE3_NAME = "mysql"
        IMAGE3_TAG = "8.0"

        IMAGE4_NAME = "httpd"
        IMAGE4_TAG = "2.4"

        IMAGE5_NAME = "alpine"
        IMAGE5_TAG = "3.16"
    }

    stages {
        stage('Build') {
            steps {
                script {
                    echo "Building application..."
                }
            }
        }

        stage('Deploy Applications') {
            parallel {
                stage('Deploy Nginx') {
                    steps {
                        deployApp(env.IMAGE1_NAME, env.IMAGE1_TAG)
                    }
                }
                stage('Deploy Redis') {
                    steps {
                        deployApp(env.IMAGE2_NAME, env.IMAGE2_TAG)
                    }
                }
                stage('Deploy MySQL') {
                    steps {
                        deployApp(env.IMAGE3_NAME, env.IMAGE3_TAG)
                    }
                }
                stage('Deploy Httpd') {
                    steps {
                        deployApp(env.IMAGE4_NAME, env.IMAGE4_TAG)
                    }
                }
                stage('Deploy Alpine') {
                    steps {
                        deployApp(env.IMAGE5_NAME, env.IMAGE5_TAG)
                    }
                }
            }
        }
    }
}
