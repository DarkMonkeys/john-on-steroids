node{
def app
    stage("Clone"){
     checkout scm   
    }
    stage('Build image') {
     app = docker.build("darkmonkey/maven")
    }
    stage("Test image"){
        docker.image('').withRun('-p 80:80') { c ->
            sh 'docker ps'
            sh 'curl localhost'
        }
    }
}
