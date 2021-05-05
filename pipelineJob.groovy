
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build'
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/patilmaheshm/ThemeParks.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
