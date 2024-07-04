package com.newapp.rolldice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.newapp.rolldice.databinding.ActivityHomePageBinding
import kotlin.random.Random

class HomePageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollButton.text = "LET'S ROLL"

        binding.rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Roll again!", Toast.LENGTH_SHORT).show()
        }

        binding.endButton.setOnClickListener {
            finish()
        }

    }

    private fun rollDice() {

        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImage.setImageResource(drawableResource)

    }
}