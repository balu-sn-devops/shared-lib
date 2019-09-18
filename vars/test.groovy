#!/usr/bin/env groovy
def call(Closure body) {

	stage('test') {
 	       snDevOpsStep (stepSysId:'2336f1d0c70400108c2c02b827c26056')
	        printBuildinfo {
	        	name = "Testing..."
	        }
	        //withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
	        	//sh 'mvn clean install -DskipTests'
		//}
    }
}
