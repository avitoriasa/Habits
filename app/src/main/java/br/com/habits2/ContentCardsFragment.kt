package br.com.habits2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val CONTEUDO = "conteudo"
private const val PERFIL = "perfil"

/**
 * A simple [Fragment] subclass.
 * Use the [ContentCardsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContentCardsFragment : Fragment() {

    private var conteudo: String? = null
    private var perfil: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            conteudo = it.getString(CONTEUDO)
            perfil = it.getString(PERFIL)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_content_cards, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ContentCardsFragment.
         */
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ContentCardsFragment().apply {
                arguments = Bundle().apply {
                    putString(CONTEUDO, conteudo)
                    putString(PERFIL, perfil)
                }
            }
    }
}