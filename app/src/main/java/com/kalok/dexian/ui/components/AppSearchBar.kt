package com.kalok.dexian.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.kalok.dexian.R
import com.kalok.dexian.ui.theme.DexianclientTheme

/**
 * 搜索栏
 */
@Composable
fun AppSearchBar(
    modifier: Modifier = Modifier
){
    var inputText by remember { mutableStateOf("") }
    Surface() {
        TextField(
            value = inputText,
            onValueChange = {inputText = it},
            label = { Text(text = "搜点想买的?")},
            trailingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null)},
            modifier = modifier.background(Color.White, CircleShape),
            singleLine = true
        )
    }
}

@Preview
@Composable
fun AppSearchBarPreview(){
    DexianclientTheme {
        AppSearchBar()
    }
}