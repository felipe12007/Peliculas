package torres.felipe.peliculas

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import java.security.AccessControlContext

class AdaptadorPeliculas: BaseAdapter {
    lateinit var context: Context

    var peliculas: ArrayList<Pelicula> = ArrayList()
    constructor(context: Context, peliculas: ArrayList<Pelicula>){
        this.context = context
        this.peliculas = peliculas
    }

    override fun getCount(): Int {
        //indica el numero de objetos en mi lista
        return peliculas.size
    }

    override fun getItem(p0: Int): Any {
        //indica el elemento individual con el cual puedo interactuar
        return peliculas[p0]
    }

    override fun getItemId(p0: Int): Long {
        //indica el id del elemento que estamos trabajando
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       //
    }


}