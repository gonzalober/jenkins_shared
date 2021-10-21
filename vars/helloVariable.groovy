def call(String name) {
  sh """
    echo "Hello ${name}, this is a function from a shared library"
  """
}