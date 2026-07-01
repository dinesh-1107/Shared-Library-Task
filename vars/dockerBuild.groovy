def call(imageName) {

    echo "Building Docker Image"

    bat "docker build -t ${imageName} ."

}
