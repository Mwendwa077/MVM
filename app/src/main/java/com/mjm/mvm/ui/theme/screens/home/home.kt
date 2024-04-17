package com.mjm.mvm.ui.theme.screens.home

import androidx.compose.runtime.Composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mjm.mvm.navigation.ROUTE_HOME
import com.mjm.mvm.navigation.ROUTE_LOGIN
import com.mjm.mvm.navigation.ROUTE_SIGN_UP

@Composable
fun Homescreen(navController: NavHostController) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "WELCOME TO OUR APP",
            fontSize = 40.sp,
            fontFamily = FontFamily.Default,
            color = Color.Black

        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Fresh food for everyone",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black

        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = { navController.navigate(ROUTE_LOGIN) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "sign in")
        }
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedButton(
            onClick = { navController.navigate(ROUTE_SIGN_UP) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "create an account")
        }

    }

}

@Preview
@Composable
private fun Homeprev() {
    Homescreen(navController = rememberNavController())

}