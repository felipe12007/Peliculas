package torres.felipe.peliculas

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorSeries: BaseAdapter {

    lateinit var context: Context

    var series: ArrayList<Series> = ArrayList()
    constructor(context: Context, series: ArrayList<Series>){
        this.context = context
        this.series = series
    }

    override fun getCount(): Int {
        //indica el numero de objetos en mi lista
        return series.size
    }

    override fun getItem(p0: Int): Any {
        //indica el elemento individual con el cual puedo interactuar
        return series[p0]
    }

    override fun getItemId(p0: Int): Long {
        //indica el id del elemento que estamos trabajando
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //obtener un inflador
        val inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.serie_view,null)

        var img: ImageView = vista.findViewById(R.id.img_view)
        var nombre: TextView = vista.findViewById(R.id.text_nombre)

        var series: Series = series[p0]

        img.setImageResource(series.img)
        nombre.setText(series.nombre)

        vista.setOnClickListener{
            val intent: Intent = Intent(context, SerieActivity::class.java)

            intent.putExtra("nombre",series.nombre)
            intent.putExtra("sinopsis",series.sinopsis)
            intent.putExtra("imagen",series.img)

            context.startActivity(intent)
        }

        return vista
    }

}