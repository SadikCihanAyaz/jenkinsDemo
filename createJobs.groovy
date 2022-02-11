pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('cihan-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/SadikCihanAyaz/spring-boot-api.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}