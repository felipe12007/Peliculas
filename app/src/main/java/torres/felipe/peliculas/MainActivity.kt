package torres.felipe.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llenar_peliculas()

        var adaptador = AdaptadorPeliculas(this,peliculas)

        var listview: ListView = findViewById(R.id.listview)

        listview.adapter = adaptador
    }

    fun llenar_peliculas(){
        val pelicula1 = Pelicula(1,getString(R.string.peli1),getString(R.string.peli1_sinop),162, R.drawable.avatar)
        peliculas.add(pelicula1)
        val pelicula2 = Pelicula(2,getString(R.string.peli2),getString(R.string.peli2_sinop),149, R.drawable.avengers_infinity_war)
        peliculas.add(pelicula2)
        val pelicula3= Pelicula(3,getString(R.string.peli3),getString(R.string.peli3_sinop),108, R.drawable.cisne_negro)
        peliculas.add(pelicula3)
        val pelicula4 = Pelicula(4,getString(R.string.peli4),getString(R.string.peli4_sinop),155, R.drawable.duna)
        peliculas.add(pelicula4)
        val pelicula5 = Pelicula(5,getString(R.string.peli5),getString(R.string.peli5_sinop),132, R.drawable.shang_chi)
        peliculas.add(pelicula5)
        val pelicula6 = Pelicula(6,getString(R.string.peli6),getString(R.string.peli6_sinop),97, R.drawable.venom)
        peliculas.add(pelicula6)

    }

}