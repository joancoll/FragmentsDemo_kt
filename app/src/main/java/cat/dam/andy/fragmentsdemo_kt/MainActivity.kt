package cat.dam.andy.fragmentsdemo_kt

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_tigers = findViewById<Button>(R.id.btn_tigers)
        val btn_zebras = findViewById<Button>(R.id.btn_zebras)
        btn_tigers.setOnClickListener { v: View? ->
            Toast.makeText(this, "Show Tigers", Toast.LENGTH_SHORT).show()
            val transaction = supportFragmentManager.beginTransaction()
            val fragment_1a = Fragment_1()
            transaction.replace(R.id.fragmentContainerView1, fragment_1a)
            val fragment_1b = Fragment_1()
            transaction.replace(R.id.fragmentContainerView2, fragment_1b)
            val fragment_1c = Fragment_1()
            transaction.replace(R.id.fragmentContainerView3, fragment_1c)
            transaction.commit()
        }
        btn_zebras.setOnClickListener { v: View? ->
            Toast.makeText(this, "Show Zebras", Toast.LENGTH_SHORT).show()
            val transaction = supportFragmentManager.beginTransaction()
            val fragment_2a = Fragment_2()
            transaction.replace(R.id.fragmentContainerView1, fragment_2a)
            val fragment_2b = Fragment_2()
            transaction.replace(R.id.fragmentContainerView2, fragment_2b)
            val fragment_2c = Fragment_2()
            transaction.replace(R.id.fragmentContainerView3, fragment_2c)
            transaction.commit()
        }
    }
}