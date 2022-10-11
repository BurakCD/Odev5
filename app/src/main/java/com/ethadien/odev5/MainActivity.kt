package com.ethadien.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ethadien.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    var numbers = ArrayList<Int>()
    var entered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.number0.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){

                entered = false
                binding.numberText.text = "0"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}0"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "0"
            }
        }
        binding.number1.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "1"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}1"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "1"
            }
        }
        binding.number2.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "2"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}2"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "2"
            }
        }
        binding.number3.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "3"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}3"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "3"
            }
        }
        binding.number4.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "4"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}4"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "4"
            }
        }
        binding.number5.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "5"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}5"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "5"
            }
        }
        binding.number6.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "6"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}6"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "6"
            }
        }
        binding.number7.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "7"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}7"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "7"
            }
        }
        binding.number8.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "8"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}8"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "8"
            }
        }
        binding.number9.setOnClickListener{
            if (entered == true && !binding.numberText.text.equals("0")){
                entered = false
                binding.numberText.text = "9"
            }
            if (entered == false && !binding.numberText.text.equals("0")){
                binding.numberText.text = "${binding.numberText.text.toString()}9"
            }
            if (binding.numberText.text.equals("0")) {
                binding.numberText.text = "9"
            }
        }
        binding.buttonClear.setOnClickListener{
            binding.allNumbers.text = ""
            binding.numberText.text = "0"
            entered = false
            numbers.clear()
        }
        binding.buttonPlus.setOnClickListener{
            try {
                val number : Int = binding.numberText.text.toString().toInt()
                if (binding.allNumbers.text == ""){
                    binding.allNumbers.text = "${binding.numberText.text}"
                }else{
                    binding.allNumbers.text = "${binding.allNumbers.text}+${binding.numberText.text}"
                }
                binding.numberText.text = "0"
                numbers.add(number)
                //entered = true

                for (i in 0..numbers.count()-1){
                    Log.e("sayilar", numbers.get(i).toString())
                }

            }catch (e : Exception){
                Log.e("Hata", "Type Convert işleminde hata")
            }
        }
        binding.buttonEqual.setOnClickListener{
            numbers.add(binding.numberText.text.toString().toInt())
            var sum = 0
            for (i in 0..numbers.count()-1){
                sum += numbers.get(i)
            }
            binding.numberText.text = sum.toString()
            binding.allNumbers.text = ""
            entered = false
            numbers.clear()
        }

        binding.backPress.setOnClickListener{
            if (binding.numberText.text != "0" || binding.numberText.text != "" ){
                binding.numberText.text = binding.numberText.text.toString().dropLast(1)
            }
            if (binding.numberText.text == ""){
                binding.numberText.text = "0"
            }
        }

    }

    fun getButtonText(){

    }
}