package controlador;

import java.util.Timer;
import java.util.TimerTask;

public class ActivityTimer {
    private static final long TIMEOUT = 100000; // 1 minuto
    private Timer timer;
    private TimerTask task;
    private Runnable onTimeout;

    public ActivityTimer(Runnable onTimeout) {
        this.onTimeout = onTimeout;
        timer = new Timer();
        start(); // Iniciar el temporizador al crear la instancia
    }

    public void start() {
        // Cancelar cualquier tarea existente antes de iniciar una nueva
        if (task != null) {
            task.cancel();
        }
        
        task = new TimerTask() {
            @Override
            public void run() {
                onTimeout.run(); // Ejecutar la acción de tiempo de espera
            }
        };
        
        timer.schedule(task, TIMEOUT);
    }

    public void reset() {
        start(); // Reiniciar el temporizador
        System.out.println("Temporizador reiniciado.");
    }

    public void stop() {
        if (timer != null) {
            timer.cancel(); // Cancelar el temporizador
        }
    }
}