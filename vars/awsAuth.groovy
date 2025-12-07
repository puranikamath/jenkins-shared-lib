def call(Map params) {
    
    def account = required(params, "account")
    def role = required(params, "role")
    def profile = defaultIfNullOrEmplty(params.profile, "default")
    
    withCrednetials([usernamePassword(credentialsId: 'cred_id' , usernameVariable: 'AWS_USR' , passwordVariable: 'AWS_PSW' )]) {
    def status = sh(returnStatus: true, script:
        'aws_sso ' 
        + ' --username ${AWS_USR} --password ${AWS_PSW}'
        + ' --role arn:aws:iam:: ' + account  + ':role/' + role
        + '-- profile' + profile
    )

        if (status == 0){
            logInfo("Aws Authentication Completed")
        }
        else{
            logInfo("Aws Authentication Failed")
        }
    }
}
