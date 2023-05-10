package com.example.aplicacionlecturas;

import javafx.application.Platform;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

private class Reloj extends Thread implements Serializable {
    private boolean relojFuncionando = false;

    public void iniciar() {
        relojFuncionando = true;
        this.start();
    }

    public void detener() {
        relojFuncionando = false;
    }

    @Override
    public void run() {
        while (relojFuncionando) {
            try {
                sleep(1000);
                Platform.runLater(() -> {
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                        //relojLabel.setText(LocalDateTime.now().format(formatter));
                        if (checkBoxAlarm.isSelected()) {
                            LocalTime horaAlarma = LocalTime.of(Integer.parseInt(hora.getText()), Integer.parseInt(minutos.getText()), 00);

                            if (horaAlarma.equals(LocalTime.parse(relojLabel.getText()))) {
                                for (int i = 0; i < 50; i++) {
                                    System.out.println("ALARMA");
                                }
                            }
                        } else {
                        }


                });
            } catch (InterruptedException e) {
                System.out.println("El reloj se ha detenido inesperadamente.");
                e.printStackTrace();
            }
        }
    }

    //COnstructor vacío necesario para que pueda emplearse como un componente y reutilizarse
    public Reloj() {

    }

}

