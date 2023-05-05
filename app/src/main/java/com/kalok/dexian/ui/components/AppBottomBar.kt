package com.kalok.dexian.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kalok.dexian.ui.theme.DexianclientTheme

@Composable
fun AppBottomBar(
    modifier: Modifier = Modifier
){
    BottomAppBar(
        modifier = modifier.fillMaxWidth(),
        containerColor = Color.White,
        contentColor = Color.Gray,
    ) {
        Spacer(modifier = modifier.width(20.dp))
        IconButton(onClick = {
            println("跳转到了首页")
        }) {
            Icon(Icons.Default.Home,null)
        }
        Spacer(modifier = modifier.width(20.dp))
        IconButton(onClick = {
            println("跳转到了论坛版面")
        }) {
            Icon(Icons.Default.Favorite,null)
        }
        Spacer(modifier = modifier.width(30.dp))
        FloatingActionButton(
            onClick = { /*TODO*/ },
            modifier = modifier.clip(shape = Shapes.Full),
            containerColor = Color(0xFF105710),
            contentColor = Color.White
        ) {
            Icon(Icons.Default.Add,null)
        }
        Spacer(modifier = modifier.width(30.dp))
        IconButton(onClick = {
            println("跳转到了聊天版面")
        }) {
            Icon(Icons.Default.Email,null)
        }
        Spacer(modifier = modifier.width(20.dp))
        IconButton(onClick = {
            println("跳转到了个人中心")
        }) {
            Icon(Icons.Default.Person,null)
        }
    }
}

@Preview
@Composable
fun AppBottomBarPreview(){
    DexianclientTheme {
        AppBottomBar()
    }
}