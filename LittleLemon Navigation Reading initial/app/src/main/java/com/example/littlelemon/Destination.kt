interface Destination {
    val route: String
}

object Home : Destination {
    override val route: String = "home"
}

object Menu : Destination {
    override val route: String = "menu"
}