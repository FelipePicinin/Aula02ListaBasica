import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class ContatoAdapter(context: Context, lista: ArrayList<Contato>) : BaseAdapter(){
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    private var listaContatos : ArrayList<Contato>
    private var inflator : LayoutInflater
    init {
        this . listaContatos = lista
        this . inflator = LayoutInflater.from(context)
    }
    override fun getCount(): Int {
        return this . listaContatos . size
    }
    override fun getItem(position: Int): Any? {
        return this . listaContatos .get(position)
    }
    override fun getItemId(position: Int): Long {
        return this .listaContatos.get(position). id
    }





}