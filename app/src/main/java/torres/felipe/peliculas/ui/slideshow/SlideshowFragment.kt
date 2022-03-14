package torres.felipe.peliculas.ui.slideshow

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
import torres.felipe.peliculas.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {
    var favoritos: ArrayList<Pelicula> = ArrayList()

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textSlideshow
        //slideshowViewModel.text.observe(viewLifecycleOwner) {
        //    textView.text = it
        //}

        llenar_favoritos()

        val adaptadorPeliculas = AdaptadorPeliculas(root.context, favoritos)

        val listview: ListView = binding.listviewFavoritos

        listview.adapter = adaptadorPeliculas

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun llenar_favoritos() {
        val favorito1 = Pelicula(
            1,
            getString(R.string.serie3),
            getString(R.string.serie3_sinop),
            162,
            R.drawable.titans
        )
        favoritos.add(favorito1)
        val favorito2 = Pelicula(
            2,
            getString(R.string.peli1),
            getString(R.string.peli1_sinop),
            149,
            R.drawable.avatar
        )
        favoritos.add(favorito2)
        val favorito3 = Pelicula(
            3,
            getString(R.string.peli3),
            getString(R.string.peli3_sinop),
            108,
            R.drawable.cisne_negro
        )
        favoritos.add(favorito3)
        val favorito4 = Pelicula(
            4,
            getString(R.string.peli5),
            getString(R.string.peli5_sinop),
            155,
            R.drawable.shang_chi
        )
        favoritos.add(favorito4)
        val favorito5 = Pelicula(
            5,
            getString(R.string.serie1),
            getString(R.string.serie1_sinop),
            132,
            R.drawable.trollhunter
        )
        favoritos.add(favorito5)
        val favorit6 = Pelicula(
            6,
            getString(R.string.serie6),
            getString(R.string.serie6_sinop),
            97,
            R.drawable.arcane
        )
        favoritos.add(favorit6)
    }
}