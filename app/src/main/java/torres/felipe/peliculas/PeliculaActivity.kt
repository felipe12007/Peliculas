package torres.felipe.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PeliculaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula)

        val tv_nombre: TextView = findViewById(R.id.tv_nombre_pelicula)
        val tv_sinop: TextView = findViewById(R.id.tv_sinop_pel)
        val iv_img: ImageView = findViewById(R.id.img_pelicula)

        val bundle = intent.extras

        if (bundle != null){
            var nombre: String = bundle.getString("nombre","")
            var sinop: String = bundle.getString("sinopsis", "")
            val img: Int = bundle.getInt("imagen")

            tv_nombre.setText(nombre)
            tv_sinop.setText(sinop)
            iv_img.setImageResource(img)
        }
    }
}