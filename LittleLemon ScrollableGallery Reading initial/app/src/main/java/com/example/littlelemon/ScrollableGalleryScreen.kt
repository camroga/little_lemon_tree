import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R

@Composable
fun ScrollableGalleryScreen() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        repeat(10) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
            ) {
                GalleryCell()
                GalleryCell()
            }
        }
    }
}

@Composable
fun GalleryCell() {
    Card(elevation = 16.dp, modifier = Modifier.padding(8.dp)) {
        Box(
            modifier = Modifier
                .size(180.dp, 180.dp)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.greeksalad),
                contentDescription = "Greek salad"
            )
            Text(
                "Greek Salad",
                fontSize = 18.sp,
                color = Color.Black,
                fontWeight = W700,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth()
                    .padding(start = 4.dp)
                    .align(Alignment.TopStart)
            )
            Text(
                text = "$12.99",
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Color.White)
                    .padding(start = 4.dp, end = 4.dp)
                    .align(Alignment.BottomEnd)
            )
        }
    }
}