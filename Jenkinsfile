@Library('listFiles') _

pipeline
{
    agent any
    stages{
        stage("1"){
            steps{
                sh 'echo "hola"'
                script{
                    valor=false
                    path = pwd()
                    valor1=0
                    valor2=1 //new File(path+"/builds").eachFileRecurse().size
                    print "nates de"
                    print "antes nuevo codigo"
                    //def findFilesValue = findFiles("vars",".groovy$")
                    def findFilesValue = findFiles("vars")
                    print "Find Files Returned: " + findFilesValue
                    print "fin nuevo codigo"
                }
                sh 'echo "adios"'
            }
        }
        stage('Inject Configuration') {
          when {
            expression { return valor }
          }
          steps {
            sh 'echo "EXISTE EN INJECT"'
          }
    }
    }
}
