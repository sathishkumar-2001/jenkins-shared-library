def call(String ImageName, String Tag) {
    echo "Deploying ${ImageName} to ${Tag}..."
    sh """
        docker pull ${ImageName}:${Tag}
        docker run -d ${ImageName}:${Tag}
    """
}
