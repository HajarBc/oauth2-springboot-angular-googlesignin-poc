package k8s.security

deny[msg] {
  input.kind == "Deployment"
  not input.spec.template.spec.securityContext.runAsNonRoot
  msg = "Pod must set runAsNonRoot in pod securityContext"
}
