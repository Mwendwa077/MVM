package com.mjm.mvm.ui.theme.screens.About

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mjm.mvm.navigation.ROUTE_HOME
import com.mjm.mvm.navigation.ROUTE_SIGN_UP
import org.w3c.dom.Text


@Composable
fun login(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context= LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(
            text = "Welcome Back",
            fontSize = 40.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black

        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "login to your account",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black

        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = email,
            leadingIcon = {Icon(imageVector = Icons.Default.Person,
                contentDescription = "email/username")},
            onValueChange = {email=it},
            label = { Text(text = "User Name/Email Address",
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()

        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = password,
            leadingIcon = {Icon(imageVector = Icons.Default.Lock,
                contentDescription = "password")},
            onValueChange = {password=it},
            label = { Text(text = "Enter Password"
                , color = Color.Black,
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )},
            modifier= Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = { navController.navigate(ROUTE_HOME) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Login")
        }



        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = { navController.navigate(ROUTE_SIGN_UP) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "sign up")
        }
    }
}

@Preview
@Composable
private fun loginprev() {
    login(navController = rememberNavController())

}