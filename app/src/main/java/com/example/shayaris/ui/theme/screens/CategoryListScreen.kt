package com.example.shayaris.ui.theme.screens

import android.graphics.SumPathEffect
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayaris.R
import com.example.shayaris.ui.theme.model.getList
import com.example.shayaris.ui.theme.primary
import com.example.shayaris.ui.theme.purple
import com.example.shayaris.ui.theme.screens.destinations.ShayariListScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@OptIn(ExperimentalMaterial3Api::class)
@Destination()
@Composable
fun CategoryListScreen(navigator : DestinationsNavigator) {
    val shayariList = getList()
    Surface {


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = purple)
    ) {
        Scaffold(
//            modifier = Modifier.fillMaxWidth().background(purple),
            topBar = {
                TopAppBar(
                    title = { Text(text = "Category", style = TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold), color = primary)  },

                    navigationIcon = {
                        Card (modifier = Modifier
                            .size(45.dp)
                            , colors = CardDefaults.cardColors(primary) , shape = RoundedCornerShape(200.dp)){
                            Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center){
                                Icon( painterResource(id = R.drawable.back_arrow), contentDescription =null , tint = Color.White )
                            }
                        }
                    }
//                backgroundColor = Color(0xFF1F1B3A),
//                contentColor = Color.White
                )
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = purple)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    shayariList.forEach { shayariModule ->
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                                .height(45.dp)
                                .clickable {  navigator.navigate(ShayariListScreenDestination(shayariModule.category)) },
                            colors = CardDefaults.cardColors(primary)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(color = primary, shape = RoundedCornerShape(10.dp)),
                                contentAlignment = Alignment.Center

                            ) {

                                Text(
                                    text = shayariModule.category,
                                    fontSize = 24.sp,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}}

@Preview
@Composable
private fun SumPathEffect() {
//    CategoryListScreen(navigator = )
}