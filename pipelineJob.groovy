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