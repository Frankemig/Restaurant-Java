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

import cl.sulcansystem.restaurante.modelo.Imagenes;
import timber.log.Timber;

public class ImagenAdapter extends RecyclerView.Adapter<ImagenAdapter.ImagenViewHolder> {
    private List<Imagenes> listaImagenes;

    public ImagenAdapter(List<Imagenes> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    @NonNull
    @Override
    public ImagenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imagenes, parent, false);
        return new ImagenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagenViewHolder holder, int position) {

        Imagenes imagenes = listaImagenes.get(position);
        holder.loadImage(imagenes);
    }

    @Override
    public int getItemCount() {
        return listaImagenes.size();
    }

    public class ImagenViewHolder extends RecyclerView.ViewHolder {

       private ImageView imagen;
       private TextView textoImagen;

        public ImagenViewHolder(@NonNull View itemView) {
            super(itemView);

            imagen = itemView.findViewById(R.id.imagen);
            textoImagen = itemView.findViewById(R.id.nombre_imagen);
        }

        public void loadImage(Imagenes imagenes) {
            Timber.d("bind() called with: imagen = [" + imagenes + "]");
            textoImagen.setText(imagenes.getImagenNombre());

            try {
                Picasso.get()
                        .load(imagenes.getImagen())
                        .resize(300, 200)
                        .placeholder(R.drawable.ic_idea_comodin)
                        .centerCrop()
                        .into(imagen);
            } catch (Exception exc) {
                Timber.e(exc);
            }
        }
    }
}
