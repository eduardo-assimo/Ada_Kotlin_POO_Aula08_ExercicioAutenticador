package ExercicioAutenticador

fun main() {
    val usuario1: Usuario = Usuario("Eduardo", "1234")
    val usuario2: Usuario = Usuario("Bernardo", "4321")
    Autenticador.login(usuario1.nome, usuario1.senha)
    Autenticador.logout(usuario1.nome, usuario1.senha)
    Autenticador.login(usuario2.nome, usuario2.senha)
    Autenticador.logout(usuario2.nome, usuario2.senha)
}