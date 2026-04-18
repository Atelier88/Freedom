pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/Atelier88/Freedom.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building project...'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }

        stage('Run') {
            steps {
                echo 'Running application...'
            }
        }
    }
}
