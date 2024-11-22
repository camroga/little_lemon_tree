package com.example.littlelemontheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemontheme.ui.theme.Charcoal
import com.example.littlelemontheme.ui.theme.LittleLemonThemeTheme
import com.example.littlelemontheme.ui.theme.Pink40
import com.example.littlelemontheme.ui.theme.Yellow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }

}

@Composable
private fun HomeScreen() {
    var isVisible by rememberSaveable { mutableStateOf(true) }

    LittleLemonThemeTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            // A surface container using the 'background' color from the theme

            AnimatedVisibility(
                visible = isVisible,
                exit = fadeOut(animationSpec = tween(2000)),
                enter = fadeIn(animationSpec = tween(2000))
            ) {
                Surface(
                    modifier = Modifier
                        .height(70.dp)
                        .fillMaxSize(),
                    //MaterialTheme.colorScheme.background
                    color = Yellow,
                ) {
                    Text(
                        text = "Lemon",
                        fontSize = 30.sp,
                    )
                }
            }
            Surface(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxSize(),
                //MaterialTheme.colorScheme.background
                color = Pink40,
            ) {
//                text: String,
//                modifier: Modifier = Modifier,
//                color: Color = Color.Unspecified,
//                fontSize: TextUnit = TextUnit.Unspecified,
//                fontStyle: FontStyle? = null,
//                fontWeight: FontWeight? = null,
//                fontFamily: FontFamily? = null,
//                letterSpacing: TextUnit = TextUnit.Unspecified,
//                textDecoration: TextDecoration? = null,
//                textAlign: TextAlign? = null,
//                lineHeight: TextUnit = TextUnit.Unspecified,
//                overflow: TextOverflow = TextOverflow.Clip,
//                softWrap: Boolean = true,
//                maxLines: Int = Int.MAX_VALUE,
//                onTextLayout: (TextLayoutResult) -> Unit = {},
//                style: TextStyle = LocalTextStyle.current
                Text(
                    text = "Little",
                    style = TextStyle(
                        color = Yellow,
                        fontSize = 24.sp,
                        fontFamily = FontFamily.Monospace,
                        letterSpacing = 4.sp,
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(8f, 8f),
                            blurRadius = 4f
                        ),
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.combine(
                            listOf(
                                TextDecoration.Underline,
                                TextDecoration.LineThrough
                            )
                        )
                    ),
                    modifier = Modifier.width(300.dp)
                )
            }
            Surface(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxSize(),
                //MaterialTheme.colorScheme.background
                color = Charcoal,
                shape = RoundedCornerShape(14.dp)
            ) {
                Text(
                    buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Yellow,
                                fontSize = 24.sp,
                            )
                        ) {
                            append("Le")
                        }
                        append("mo")
                        withStyle(
                            style = SpanStyle(
                                color = Yellow,
                                fontSize = 24.sp
                            )
                        ) {
                            append("n")
                        }
                    },
                    modifier = Modifier
                        .wrapContentSize()
                        .border(2.dp, color = Color.Black),
//                                            textAlign = TextAlign.Center,
                )
            }
            Button(onClick = { isVisible = !isVisible }, Modifier.wrapContentSize()) {
                Text(text = "Order")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HomeScreen()
}