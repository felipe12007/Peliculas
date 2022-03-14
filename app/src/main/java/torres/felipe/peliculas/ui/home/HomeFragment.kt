package torres.felipe.peliculas.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import torres.felipe.peliculas.AdaptadorPeliculas
import torres.felipe.peliculas.Pelicula
import torres.felipe.peliculas.R
import torres.felipe.peliculas.Series
import torres.felipe.peliculas.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    var peliculas: ArrayList<Pelicula> = ArrayList()

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

       // val textView: TextView = binding.texthome
       // homeViewModel.text.observe(viewLifecycleOwner) {
            //textView.text = it
        //}

        llenar_peliculas()

        val adaptadorPeliculas = AdaptadorPeliculas(root.context, peliculas)

        val listview: ListView = binding.listviewPeliculas

        listview.adapter = adaptadorPeliculas
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
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