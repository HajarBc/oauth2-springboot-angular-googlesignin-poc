package k8s.security

deny[msg] {
  containers := input.spec.template.spec.containers
  some i
  containers[i].image == img
  endswith(img, ":latest")
  msg = "Avoid using :latest tag"
}
