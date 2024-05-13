package com.example.movieapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Detail : Screen("detail_Movie")
    data object Populer : Screen("populer")
    data object About : Screen("about")

}
