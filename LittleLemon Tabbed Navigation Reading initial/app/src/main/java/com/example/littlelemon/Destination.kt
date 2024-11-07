import androidx.annotation.DrawableRes
import com.example.littlelemon.R

interface Destination {
    val route: String
    val icon: Int
    val title: String
}

object Home : Destination {
    override val title: String = "Home"
    override val route: String = "Home"
    override val icon: Int = R.drawable.ic_home
}

object Menu : Destination {
    override val title: String = "Menu"
    override val route: String = "Menu"
    override val icon: Int = R.drawable.ic_menu
}

object Location : Destination {
    override val title: String = "Location"
    override val route: String = "Location"
    override val icon: Int = R.drawable.ic_location
}