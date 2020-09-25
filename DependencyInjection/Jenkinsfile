pipeline{
	agent any
	
	stages{
		stage('clean'){
			steps{
				echo "Hello World from pipelines"
				sh 'mvn clean'
			}
		}
		
	
		stage('test'){
			steps{
				echo "Hello World from pipelines"
				sh 'mvn test'
				}
			}

		stage('package'){
			steps{
				echo "Hello World from pipelines"
				sh 'mvn install -DsktipTests'
			}
		}
    }
}
