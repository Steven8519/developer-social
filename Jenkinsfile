node {
    stage('SCM Checkout'){
        git credentialsId: 'GIT_CREDENTIALS', url:  'https://github.com/Steven8519/developer.git', branch: 'master'
    }
    stage("Gradle Build"){
      sh "gradle clean build"

    }
    stage('Build Docker Image'){
        sh 'docker build -t steven8519/developer-social .'
    }

    stage('Push Docker Image'){
        withCredentials([string(credentialsId: 'Docker_Hub_ID', variable: 'Docker_Hub_ID')]) {
          sh "docker login -u steven8519 -p ${Docker_Hub_ID}"
        }
        sh 'docker push steven8519/developer-social '
    }

    stage("Deploy app"){
        sh 'kubectl apply -f deployment.yaml'
    }
}
