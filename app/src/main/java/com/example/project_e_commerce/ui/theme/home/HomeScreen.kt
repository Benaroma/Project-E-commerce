package com.example.project_e_commerce.ui.theme.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.project_e_commerce.R
import com.example.project_e_commerce.data.AuthViewModel
import com.example.project_e_commerce.navigation.ROUTE_ADD_PRODUCT
import com.example.project_e_commerce.navigation.ROUTE_ASSET
import com.example.project_e_commerce.navigation.ROUTE_LOGIN
import com.example.project_e_commerce.navigation.ROUTE_REGISTER
import com.example.project_e_commerce.navigation.ROUTE_VIEW_PRODUCT
import com.example.project_e_commerce.navigation.ROUTE_VIEW_UPLOAD

//@Composable
//fun HomeScreen(navController: NavController) {
//        var email by remember { mutableStateOf(TextFieldValue("")) }
//        var pass by remember { mutableStateOf(TextFieldValue("")) }
//        val context = LocalContext.current
//
//        Column(modifier = Modifier.fillMaxSize()) {
//            Box {
//                Image(
//                    painter = painterResource(id = R.drawable.ben1),
//                    contentDescription = null,
//                    modifier = Modifier.fillMaxSize(),
//                    contentScale = ContentScale.Crop
//                )
//
//                Column(modifier = Modifier.fillMaxSize()) {
//                    Text(
//                        text = "Welcome to Benaroma Housing App",
//                        fontSize = 30.sp,
//                        fontFamily = FontFamily.Cursive,
//                        color = Color.Magenta,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .align(Alignment.CenterHorizontally)
//                    )
//
//                    Spacer(modifier = Modifier.height(30.dp))
//
////                Button(onClick = {
////                    val loginpage=AuthViewModel(navController,context)
////                    loginpage.login(email.text.trim(),pass.text.trim())
////                    navController.navigate(ROUTE_INDEX)
////
////                }) {
////                    Text(text = "Login")
////                }
//                    Text(text = "login",
//                        fontSize = 15.sp,
//                        modifier = Modifier
//                            .clickable {
//                                AuthViewModel(navController, context).apply {
//                                }
//                                val loginpage = AuthViewModel(navController, context)
//                                loginpage.login(email.text.trim(), pass.text.trim())
//                                navController.navigate(ROUTE_LOGIN)
//                            }
//                            .align(AbsoluteAlignment.Right))
//
//
////                Spacer(modifier = Modifier.height(30.dp))
//
////                Button(onClick = {
////                    AuthViewModel(navController, context).apply {
////                        signup(email.text.trim(), pass.text.trim(), confpass = String())
////                        navController.navigate(ROUTE_REGISTER)
////
////                    }
////                }) {
////                    Text(text = "Sign Up")
////                }
//                    //Text(text = "Sign Up",
//                    //    fontSize = 15.sp,
//                     //   modifier = Modifier
//                      //      .clickable {
//                        //        AuthViewModel(navController, context).apply {
//                          //      }
//                            //    val signuppage = AuthViewModel(navController, context)
//                              //  signuppage.login(email.text.trim(), pass.text.trim())
//                               // navController.navigate(ROUTE_REGISTER)
//                            //}
//                            //.align(AbsoluteAlignment.Left))
//
//                    Spacer(modifier = Modifier.height(35.dp))
//
//                    Text(
//                        text = "sign up",
//                        color = Color.Cyan,
//                        textAlign = TextAlign.Center,
//                        fontSize = 15.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .clickable {
//                                AuthViewModel(navController, context).apply {
//                                    login(email.text.trim(), pass.text.trim())
//                                    navController.navigate(ROUTE_REGISTER)
//                                }
//                            }
//                    )
//                    Spacer(modifier = Modifier.height(30.dp))
//                    Text(
//                        text = "View Assets",
//                        color = Color.Cyan,
//                        textAlign = TextAlign.Center,
//                        fontSize = 15.sp,
//                        fontWeight = FontWeight.Bold,
//                        modifier = Modifier
//                            .clickable {
//                                AuthViewModel(navController, context).apply {
//                                    login(email.text.trim(), pass.text.trim())
//                                    navController.navigate(ROUTE_ASSET)
//                                }
//                            }
//                    )
//
//                    Spacer(modifier = Modifier.height(40.dp))
//
//                Text(
//                    text = "Login",
//                    color = Color.Yellow,
//                    textAlign = TextAlign.Center,
//                    fontWeight = FontWeight.Bold,
//                    fontSize = 15.sp,
//                    modifier = Modifier.clickable {
//                       AuthViewModel(navController, context).apply {
//                            login(email.text.trim(), pass.text.trim())
//                            navController.navigate(ROUTE_LOGIN)
//                        }
//                    }
//                )
//                    Spacer(modifier = Modifier
//                        .height(25.dp)
//                        .padding(25.dp))
//                    Text(
//                        text = "We are one world's top best sellers of housing assets.",
//                        color = Color.Yellow,
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.SemiBold,
//                        fontFamily = FontFamily.Default,
//                        modifier = Modifier
//                            .padding(5.dp)
//                    )
//
//
//                    Text(
//                        text = "Register now to get a loyalty card and earn credit scores for VIP membership.",
//                        color = Color.Yellow,
//                        fontFamily = FontFamily.Default,
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.SemiBold,
//                        modifier = Modifier
//                            .padding(5.dp)
//                    )
//
//                    Text(
//                        text = "Get up-to-date of apartment prices including offers and discounts available.",
//                        fontFamily = FontFamily.SansSerif,
//                        color = Color.Yellow,
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.SemiBold,
//                        modifier = Modifier
//                            .padding(5.dp)
//                    )
//                }
//            }
//            Spacer(modifier = Modifier.height(20.dp))
//            Button(onClick = {
//                navController.navigate(ROUTE_ASSET)
//            },modifier = Modifier.fillMaxWidth()) {
//                Text(text = "View Assets")
//
//            }
//        }
//    }
//
//@Preview
//@Composable
//private fun HomePrev() {
//    HomeScreen(navController = rememberNavController())
//}
@Composable
fun HomeScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context= LocalContext.current
//        var productdata=productviewmodel(navController,context)

        Text(text = "Welcome to Home page",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {
            navController.navigate(ROUTE_ADD_PRODUCT)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add Asset")
        }
        Spacer(modifier = Modifier.height(50.dp))

        Button(onClick = {
            navController.navigate(ROUTE_VIEW_PRODUCT)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "View Asset")
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
            navController.navigate(ROUTE_VIEW_UPLOAD)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "View Uploaded Asset")
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {
            navController.navigate(ROUTE_ASSET)
        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "View Assets available")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Have an Account? Click to Login")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUTE_REGISTER)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Don't have account? Click to Register")
        }
    }
}

@Preview
@Composable
fun Homepreview() {
    HomeScreen(rememberNavController())
}