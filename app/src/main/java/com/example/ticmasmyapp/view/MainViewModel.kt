package com.example.ticmasmyapp.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ticmasmyapp.model.Comparador


class MainViewModel: ViewModel() {
    /*val comparador: LiveData<Comparador> get() = _comparador
    private var _comparador = MutableLiveData(Comparador(String(), String()))*/
    val texto1: LiveData<Comparador> get() = _texto1
    private var _texto1 = MutableLiveData<Comparador>(null)
    val texto2: LiveData<Comparador> get() = _texto2
    private var _texto2 = MutableLiveData<Comparador>(null)
}






/* ESTE ES EL QUE VA
    @SuppressLint("StaticFieldLeak", "SuspiciousIndentation")
    private lateinit var button1: Button

    fun comparar() {

        lateinit var editText1: EditText
        lateinit var editText2: EditText
        lateinit var textIn: TextView

        button1.setOnClickListener {
            @SuppressLint("MissingInflatedId", "SetTextI18n")

            if (editText1 == editText2) {
                textIn.text = "Los textos ingresados son iguales"

                return@setOnClickListener
            } else {
                textIn.text = "Los textos ingresados no coinciden"
                return@setOnClickListener
            }
        }


   } HASTA ACA*/
//}
