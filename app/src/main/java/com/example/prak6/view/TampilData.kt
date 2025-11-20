package com.example.prak6.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.prak6.model.Siswa
import com.example.prak6.R



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

}
