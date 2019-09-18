#!/usr/bin/env groovy
def call(Closure body) {

	stage('compile') {
 	       snDevOpsStep (stepSysId:'2b36f1d0c70400108c2c02b827c26055')
	        printBuildinfo {
	        	name = "Testing..."
	        }
	        //withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
	        	//sh 'mvn clean install -DskipTests'
		//}
    }
}
