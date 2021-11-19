package com.mirzayogy.a211androidi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val email = intent.getStringExtra("email")
        val noHandphone = intent.getStringExtra("noHandphone")
        val tanggalLahir = intent.getStringExtra("tanggalLahir")
        val jumlahMatakuliah = intent.getIntExtra("jumlahMatakuliah",0)

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val noHandphoneTextView = findViewById<TextView>(R.id.noHandphoneTextView)
        val tanggalLahirTextView = findViewById<TextView>(R.id.tanggalLahirTextView)
        val jumlahMatakuliahTextView = findViewById<TextView>(R.id.jumlahMatakuliahTextView)

        namaTextView.setText(nama)
        emailTextView.setText(email)
        noHandphoneTextView.setText(noHandphone)
        tanggalLahirTextView.setText(tanggalLahir)
        jumlahMatakuliahTextView.setText(jumlahMatakuliah.toString())

    }
}