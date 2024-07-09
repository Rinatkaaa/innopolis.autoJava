package Intermediate_certification;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class CactusWatering {
    private LocalDate dateOfLastWatering;
    private Sensor sensor;
    private Winter winter;
    private Summer summer;
    private AutumnSpring autumnSpring;

    public CactusWatering(LocalDate dateOfLastWatering) {
        this.dateOfLastWatering = dateOfLastWatering;
        this.sensor = new Sensor();
        this.winter = new Winter();
        this.autumnSpring = new AutumnSpring();
        this.summer = new Summer();
    }

    public LocalDate getDateOfLastWatering() {
        return dateOfLastWatering;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public Winter getWinter() {
        return winter;
    }

    public Summer getSummer() {
        return summer;
    }

    public AutumnSpring getAutumnSpring() {
        return autumnSpring;
    }

    public void IrrigationCheck() {
        LocalDate today = LocalDate.now();
        if (winter.getTimestamp(today)) {
            dateOfLastWatering = dateOfLastWatering.plus(1, ChronoUnit.MONTHS);
        } else if (autumnSpring.getTimestamp(today)) {
            dateOfLastWatering = dateOfLastWatering.plus(1, ChronoUnit.MONTHS);
        } else if (summer.getTimestamp(today)) {
            if (ChronoUnit.DAYS.between(dateOfLastWatering, today) >= 20) {
                int humidity = sensor.getHumidity();
                if (humidity < 30) {
                    dateOfLastWatering = today;
                } else {
                    dateOfLastWatering = dateOfLastWatering.plus(20, ChronoUnit.DAYS);
                }
            } else {
                dateOfLastWatering = dateOfLastWatering.plus(20, ChronoUnit.DAYS);
            }
        }
        System.out.println("Следующий полив кактуса должен быть: " + dateOfLastWatering);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CactusWatering that = (CactusWatering) o;
        return Objects.equals(dateOfLastWatering, that.dateOfLastWatering) && Objects.equals(sensor, that.sensor) && Objects.equals(winter, that.winter) && Objects.equals(summer, that.summer) && Objects.equals(autumnSpring, that.autumnSpring);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateOfLastWatering, sensor, winter, summer, autumnSpring);
    }

    @Override
    public String toString() {
        return "CactusWatering{" +
                "dateOfLastWatering=" + dateOfLastWatering +
                ", sensor=" + sensor +
                ", winter=" + winter +
                ", summer=" + summer +
                ", autumnSpring=" + autumnSpring +
                '}';
    }
}
