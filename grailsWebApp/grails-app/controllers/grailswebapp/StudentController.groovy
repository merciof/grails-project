package grailswebapp

class StudentController {

    String firstName
    String lastName

    def index() {
        
        render "Olá de dentro do método index() do StudentController"
    }
}
