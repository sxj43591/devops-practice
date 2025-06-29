pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git 'https://github.com/sxj43591/devops-practice.git'
      }
    }
    stage('Build') {
      steps {
        sh 'javac HelloWorld.java'
      }
    }
    stage('Test') {
      steps {
        sh 'java HelloWorld'
      }
    }
  }
}

