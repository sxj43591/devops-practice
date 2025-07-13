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
   stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Package') {
      steps {
        sh 'mvn package'
      }
    }
    stage('Run') {
      steps {
        sh 'java -cp target/helloworld-1.0.jar com.example.HelloWorld'
      }
    }
  }
}

