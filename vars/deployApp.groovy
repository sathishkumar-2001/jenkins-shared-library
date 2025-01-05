def call(String appName, String environment) {
    echo "Deploying ${appName} to ${environment}..."
    sh """
        docker pull ${appName}:${environment}
        docker run -d ${appName}:${environment}
    """
}
