node{
    stage('checkout')
    checkout scm
    //git 'https://github.com/krvamshi/java-hello-world-with-maven.git'

    stage('clean and install')
    sh label: '', script: 'mvn clean install'

    stage('Generate Junit Test Reports')
    junit 'target/surefire-reports/TEST-hello.HelloWorldTest.xml'

}