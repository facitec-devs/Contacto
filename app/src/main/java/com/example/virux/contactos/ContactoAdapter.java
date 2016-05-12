package com.example.virux.contactos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by virux on 05/05/16.
 */
public class ContactoAdapter  extends BaseAdapter{

    List<Contacto> contactos;
    Context context;

    public ContactoAdapter(List<Contacto> contactos, Context context) {
        this.contactos = contactos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.contactos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.contactos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.item_contacto,null);
        }

        Contacto c = this.contactos.get(position);

        TextView nombreTextView = (TextView) v.findViewById(R.id.textViewNombre);
        TextView emailTextView = (TextView)v.findViewById(R.id.textViewEmail);
        ImageView fotoImageView = (ImageView)v.findViewById(R.id.imageViewFoto);



        nombreTextView.setText(c.getNombre());
        emailTextView.setText(c.getEmail());

        //Todo foto;

        return v;
    }

}
