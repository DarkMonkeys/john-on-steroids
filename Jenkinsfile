node{
def app
    stage("Clone"){
     checkout scm   
    }
    stage('Build image') {
     app = docker.build("darkmonkey/maven")
    }
    stage("Test image"){
      
        docker {
          image 'darkmonkey/maven'
          args '-p 80:80'
      }
      steps{
        sh 'mvn clean install'
      }
    }
}
