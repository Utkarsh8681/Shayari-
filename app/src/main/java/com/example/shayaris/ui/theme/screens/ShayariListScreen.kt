package com.example.shayaris.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayaris.ui.theme.model.getList
import com.ramcosta.composedestinations.annotation.Destination

@OptIn(ExperimentalMaterial3Api::class)
@Destination
@Composable
fun ShayariListScreen(category: String) {
    val shayariList = getList().find { it.category == category }?.shayaris ?: emptyList()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = category , color = Color.White) },
//                backgroundColor = Color(0xFF1F1B3A),
//                contentColor = Color.White
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(shayariList) { shayari ->
                Text(
                    text = shayari,
                    fontSize = 18.sp,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .background(Color(0xFF3A3A3C))
                        .padding(16.dp)
                )
            }
        }
    }
}
