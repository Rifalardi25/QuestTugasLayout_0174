package com.example.tugas4_pam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TampilanAwal(modifier: Modifier){
    Box(
        modifier = modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(id = R.drawable.foto_bg),
            contentDescription = "Background Langit",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, bottom = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.prodi),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.white)
            )
            Text(
                text = stringResource(id = R.string.univ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.white)
            )

            Spacer(modifier = Modifier.height(20.dp))

            ProfilTemplateCard(
                nama = stringResource(id = R.string.namake1),
                alamat = stringResource(id = R.string.alamatke1),
                nim = stringResource(id = R.string.nimke1),
                bgCard = colorResource(id = R.color.lightgreen)
            )

            ProfilTemplateCard(
                nama = stringResource(id = R.string.namake2),
                alamat = stringResource(id = R.string.alamatke2),
                nim = stringResource(id = R.string.nimke2),
                bgCard = colorResource(id = R.color.green)
            )

            ProfilTemplateCard(
                nama = stringResource(id = R.string.namake3),
                alamat = stringResource(id = R.string.alamatke3),
                nim = stringResource(id = R.string.nimke3),
                bgCard = colorResource(id = R.color.yellow)
            )

            ProfilTemplateCard(
                nama = stringResource(id = R.string.namake4),
                alamat = stringResource(id = R.string.alamatke4),
                nim = stringResource(id = R.string.nimke4),
                bgCard = colorResource(id = R.color.red)
            )
          }

        Text(
            text = stringResource(id = R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = colorResource(id = R.color.white)
        )
     }
}

@Composable
fun ProfilTemplateCard(
    modifier: Modifier = Modifier,
    nama : String,
    alamat : String,
    nim : String,
    bgCard : Color
    ){
        Card(modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 6.dp),
            colors = CardDefaults.cardColors(
                containerColor = bgCard)

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.logo_umy),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp)
                )

                Spacer(modifier = Modifier.width(16.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = nama,
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.white)
                    )

                    Text(
                        text = nim,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Cyan
                    )

                    Text(
                        text = alamat,
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.white)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Image(
                    painter = painterResource(id = R.drawable.logo_umy),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp)
                )
             }
          }

     }