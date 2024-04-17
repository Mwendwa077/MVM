package com.mjm.mvm.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mjm.mvm.ui.theme.screens.About.login

import com.mjm.mvm.ui.theme.screens.home.Homescreen
import com.mjm.mvm.ui.theme.screens.sign_up.registration


@Composable
fun AppNavigation(modifier: Modifier=Modifier,
                  navController:NavHostController= rememberNavController(),
                  startDestination:String= ROUTE_HOME) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination)
    {composable(ROUTE_HOME){
        Homescreen(navController)
    }
        composable(ROUTE_LOGIN){
            login(navController)
        }
    composable(ROUTE_SIGN_UP){
        registration(navController)

    }
    }
}