package com.example.prak6.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.prak6.model.Siswa
import com.example.prak6.R



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked:()->Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(id = R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(R.string. alamat), statusUiSiswa.alamat)
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = { Text(stringResource(id = R.string.detail), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id=R.color.purple_500)),
            )
        }

    ){}

}
