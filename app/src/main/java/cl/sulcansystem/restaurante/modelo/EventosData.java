package cl.sulcansystem.restaurante.modelo;


import java.util.ArrayList;
import java.util.List;

public class EventosData {
    private static List<Evento>eventosList = new ArrayList<>();

    public EventosData() {
    }

    public static List<Evento> getEventosList() {
        return eventosList;
    }

    public static void setEventosList(List<Evento> eventosList) {
        EventosData.eventosList = eventosList;
    }
    static {
        int id = 0;
        eventosList.add(new Evento(id++, "Día de la Madre","https://firebasestorage.googleapis.com/v0/b/restaurante-373af.appspot.com/o/Empleados%2Fimagenes%2FDSC_0036.jpg?alt=media&token=24d2bf75-48b0-47c0-a8c6-95c89c382fda"));
        eventosList.add(new Evento(id++, "Día de la Madre","https://firebasestorage.googleapis.com/v0/b/restaurante-373af.appspot.com/o/Empleados%2Fimagenes%2FDSC_0039.jpg?alt=media&token=c8694975-e959-4a32-8cb1-86b9b2a6938e"));
    }
}
