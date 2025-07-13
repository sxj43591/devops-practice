pipeline {
  agent any
  tools {
    maven 'Maven 3.9'
    }
  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/sxj43591/devops-practice.git'
      }
    }
    stage('Build with Maven') {
      steps {
        sh 'mvn clean compile'
      }
    }
    stage('Run') {
      steps {
        sh 'java -cp target/classes com.example.HelloWorld'
      }
    }
  }
}

