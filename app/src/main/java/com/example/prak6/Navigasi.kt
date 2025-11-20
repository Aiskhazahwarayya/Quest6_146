package com.example.prak6

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.prak6.viewmodel.SiswaViewModel

enum class Navigasi {
    Formulir,
    Detail
}

@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    viewModel: SiswaViewModel = viewModel(),
    modifier: Modifier
){}