package com.mirzayogy.a211androidi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val noHandphoneEditText = findViewById<EditText>(R.id.noHandphoneEditText)
        val tanggalLahirEditText = findViewById<EditText>(R.id.tanggalLahirEditText)
        val jumlahMatakuliahEditText = findViewById<EditText>(R.id.jumlahMatakuliahEditText)

        simpanButton.setOnClickListener {
            Toast.makeText(this,"Hai ",Toast.LENGTH_SHORT).show()

            val nama = namaEditText.text.toString()
            val email = emailEditText.text.toString()
            val noHandphone = noHandphoneEditText.text.toString()
            val tanggalLahir = tanggalLahirEditText.text.toString()
            val jumlahMatakuliah = jumlahMatakuliahEditText.text.toString().toInt()

            val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("email", email)
            intent.putExtra("noHandphone", noHandphone)
            intent.putExtra("tanggalLahir", tanggalLahir)
            intent.putExtra("jumlahMatakuliah", jumlahMatakuliah)
            startActivity(intent)
        }

        batalButton.setOnClickListener {
            finish()
        }
    }
}