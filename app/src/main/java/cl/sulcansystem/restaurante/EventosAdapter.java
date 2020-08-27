package cl.sulcansystem.restaurante;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.sulcansystem.restaurante.modelo.Evento;
import timber.log.Timber;

public class EventosAdapter extends RecyclerView.Adapter<EventosAdapter.EventoViewHolder> {
    private List<Evento>eventoList;

    public EventosAdapter(List<Evento> eventoList) {
        this.eventoList = eventoList;

    }

    @NonNull
    @Override
    public EventoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imagenes, parent, false);
        return new EventoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventoViewHolder holder, int position) {
        Evento evento = eventoList.get(position);
        holder.loadImageEvento(evento);
    }

    @Override
    public int getItemCount() {
        return eventoList.size();
    }

    public class EventoViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagenEvento;
        private TextView nombreEvento;
        public EventoViewHolder(@NonNull View itemView) {
            super(itemView);
            imagenEvento = itemView.findViewById(R.id.imagen);
            nombreEvento = itemView.findViewById(R.id.nombre_imagen);
        }
        public void loadImageEvento(Evento evento) {
            Timber.d("bind() called with: imagenEvento = [" + evento + "]");
            nombreEvento.setText(evento.getNombreEvento());

            try {
                Picasso.get()
                        .load(evento.getImagenEvento())
                        .resize(300, 200)
                        .placeholder(R.drawable.ic_idea_comodin)
                        .centerCrop()
                        .into(imagenEvento);
            } catch (Exception exc) {
                Timber.e(exc);
            }
        }
    }
}
