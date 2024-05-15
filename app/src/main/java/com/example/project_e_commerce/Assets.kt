package com.example.project_e_commerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project_e_commerce.navigation.ROUTE_HOME
import com.example.project_e_commerce.navigation.ROUTE_LOGIN
import com.example.project_e_commerce.ui.theme.Project_ECommerceTheme

class Assets : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project_ECommerceTheme {
                    AssetList(navController = rememberNavController())
                }
            }
        }
    }

data class AssetModel(val name:String, val image : Int)

@Composable
fun ListRow(model: AssetModel) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(Color.Cyan)
    ) {
        Image(
            painter = painterResource(id = model.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.White
        )
    }
}
private val assetsList = mutableListOf<AssetModel>().apply {

    add(AssetModel("Single", R.drawable.single))
    add(AssetModel("Bungalow",R.drawable.bungalow))
    add(AssetModel("Cabin", R.drawable.cabin))
    add(AssetModel("Mansion",R.drawable.mansion))
    add(AssetModel("Manor",R.drawable.manor))
}

@Composable
fun AssetList(navController:NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        items(assetsList) { model ->
            ListRow(model = model)
        }
    }
    //Spacer(modifier = Modifier.height(20.dp))
    Button(onClick = {
        navController.navigate(ROUTE_HOME) }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Home")
        }
    }



@Preview
@Composable
private fun AssetPrev() {
    AssetList(navController = rememberNavController())
}