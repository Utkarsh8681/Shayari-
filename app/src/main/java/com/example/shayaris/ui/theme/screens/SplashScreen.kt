package com.example.shayaris.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.shayaris.R
import com.example.shayaris.ui.theme.purple
import com.example.shayaris.ui.theme.screens.destinations.CategoryListScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay

@Destination(start = true)
@Composable
fun SplashScreen(
    navigator : DestinationsNavigator
) {
    LaunchedEffect(UInt) {
        delay(3000)
        navigator.navigate(CategoryListScreenDestination)

    }

    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(color = purple)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painterResource(id = R.drawable.shayari_logo),
                contentDescription = "",
                modifier = Modifier
                    .size(100.dp)

            )
        }
    }
}

