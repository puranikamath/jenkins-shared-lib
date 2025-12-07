@Library('library-demo') _


pipeline {
    agent any
    stages {
        // stage('Demo') {
        //     steps {
        //         echo 'Executing a shared lib function'
        //         sayHello 'Devops'

        //     }
        // }
        stage('Checkout') {
            steps {
                script {
                    sh("""
                       rm -rf hello-world-war
                       git clone https://github.com/Tejasks16/hello-world-war.git
                       ls -ltr
                    """)
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    build 'install'
                }
            }
        }
    }
}
