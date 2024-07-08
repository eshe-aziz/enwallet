package com.akirachix.myfirstandroidassessment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myfirstandroidassessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvEnWallet.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL, false
        )
        displayWallet()

    }
    fun displayWallet(){
        val enWallet1 = Enwallet("Rent","KES16000","1 July 2024")
        val enWallet2 = Enwallet("Electricity", "KES 18700", "2 July 2024")
        val enWallet3 = Enwallet("Water", "KES 24400", "3 July 2024")

        val myWallet = listOf(enWallet1, enWallet2, enWallet3)

        val EnWalletAdapter = EnWalletAdapter(myWallet)
        binding.rvEnWallet.adapter = EnWalletAdapter

    }


}