package com.example.virux.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView contactosListView;
    List<Contacto> contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactosListView = (ListView)findViewById(R.id.listViewContactos);

        contactos = getContactos();

        ContactoAdapter adapter = new ContactoAdapter(contactos,this);

        contactosListView.setAdapter(adapter);



    }

    private List<Contacto> getContactos(){
        List<Contacto> contactos = new ArrayList<>();
        for(int i = 0; i<100;i++){
            Contacto c = new Contacto();
            c.setNombre("Oscar Duarte "+i);
            c.setEmail("leodufer@gmail.com "+i );
            contactos.add(c);
        }
        return contactos;
    }
}
